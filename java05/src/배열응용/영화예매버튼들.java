package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매버튼들 {

	public static void main(String[] args) {
		JFrame f = new JFrame(); //프레임 생성
		f.setSize(1000, 450); //프레임 사이즈 설정
		//물흐르듯이 순서대로 배치를 해주는 부품이 필요;FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		int[] seat = new int[200]; //{0,0,0,0,...} -> 예매되면 1로 변경
		//길이가 200인 정수배열 만들기; 초기값은 0!
		for (int i = 0; i < seat.length; i++) {
			JButton b = new JButton(); //버튼 생성, 번호매기기(i+1)
			b.setText(i + ""); //더하기 연산자라서 하나라도 스트링이면 다 스트링.! 그래서 공백 넣으면 안됨!
			f.add(b); //프레임에 버튼 올리기
			b.setBackground(Color.yellow);
			
			// 좌석 버튼 클릭했을때, 이벤트 발생 >> 액션리스너..!
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//100번 버튼을 누른걸로 가정하고 주석.!
					System.out.println("버튼을 누르셨군요.!");
					b.setBackground(Color.red); //100번 버튼색 변경됨
					System.out.println("좌석번호는 " + b.getText() + "번 입니다."); 
					//누른 버튼의 Text(좌석번호) 가져와 getText => 스트링"100"
					
					//좌석번호가  seat배열의 index 역할하도록 => int로 바꿔줘야함
					//누른 버튼의 Text(좌석번호)가져와서, 정수로 바꾼 후 num이라는 변수를 만들어 집어넣음
					int num = Integer.parseInt(b.getText()); //정수 100

					//num번 배열의 값이 0인 경우: 예매가 안된 상황이라고 가정
					//num번 배열의 값을 1로 변경한 경우 : 예매가 된 상황이라고 가정
					seat[num] = 1; // 클릭된 100번좌석 예매됨 배열값1로 변경 => seat[100] = 1;
					b.setEnabled(false);//클릭기능을 막음.(이미 1인 좌석 클릭 못하도록)
				}
			
			});
		
		} //for문 끝
		
		
		//결제하기 버튼 만들기
		JButton b2 = new JButton();
		b2.setText("결제하기");
		f.add(b2);
		b2.setBackground(Color.blue);	
		b2.setForeground(Color.white);
		
		//결제하기 버튼 눌렀을때
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//seat 배열에 있는 값 하나씩 가지고와서, 각 값이 1인 경우
				//예매된 자리입니다. 라고 프린트
				//1 카운트!
				//결제금액!
				int count = 0;
				System.out.print("예매하신 좌석>> ");
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						//예매한 좌석번호 프린트!
						System.out.print(i + " ");
						//더하기연산자, 하나라도 스트링이면 다 스트링이어서 i+1연산 못넣음
						count++; //카운트!
					}
				}
				System.out.println();
				//결제금액!
				System.out.println("총 " + count + "석, 결제하실 금액은 " + count*10000 + "원 입니다.");
					
			}
		});
	      f.setVisible(true);
		}
	}

// 좌석번호를 1~200 으로 설정하는 방법? 200번 좌석 누를때 자꾸 에러남
