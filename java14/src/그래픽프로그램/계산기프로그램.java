package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import 클래스연습.계산기;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기프로그램 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(65, 75, 133, 48);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(206, 75, 187, 48);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(65, 135, 133, 48);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(206, 135, 187, 48);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //디자인에서 버튼 더블클릭하면 생김
				System.out.println("더하기 버튼 클릭됨.");
				//t1, t2에 입력한 값을 가지고 와야함.(텍스트필드)
				String s1 = t1.getText(); //String으로 "200"을 가져와서 s1변수에 넣음
				String s2 = t2.getText(); //String으로 "100"을 가져와서 s2변수에 넣음
				System.out.println(s1);
				System.out.println(s2);
				System.out.println("+------");
				//계산하려면, String을 int로 변환해주어야 함.
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음. (void는 변수에 넣을 수 없다.)
				int i1 = Integer.parseInt(s1); //반환이 있는 함수 Integer.parseInt()
				int i2= Integer.parseInt(s2);
				계산기 cal = new 계산기(); //계산기라는 틀(class)로 cal이라는 계산기 복사
				int result = cal.add(i1, i2);
				t3.setText("더한 값은 " + result);
				
			}
		});
		btnNewButton.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(206, 254, 83, 83);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼 클릭됨.");
				String s1 = t1.getText(); //String으로 "200"을 갖다줌.
				String s2 = t2.getText(); //String으로 "100"을 갖다줌.
				System.out.println(s1);
				System.out.println(s2);
				System.out.println("-------");
				//String을 int로 변환해주어야 함.
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1);
				int i2= Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.minus(i1, i2); //반환값이 없는 함수일때는 변수에 대입 불가!
				t3.setText("뺀 값은 " + result);
			}
		});
		btnNewButton_1.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(310, 254, 83, 83);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("곱하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기 버튼 클릭됨.");
				//t1, t2에 입력한 값을 가지고 와야함.(텍스트필드)
				String s1 = t1.getText(); //String으로 "200"을 가져와서 s1변수에 넣음
				String s2 = t2.getText(); //String으로 "100"을 가져와서 s2변수에 넣음
				System.out.println(s1);
				System.out.println(s2);
				System.out.println("*------");
				//계산하려면, String을 int로 변환해주어야 함.
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음. (void는 변수에 넣을 수 없다.)
				int i1 = Integer.parseInt(s1); //반환이 있는 함수 Integer.parseInt()
				int i2= Integer.parseInt(s2);
				계산기 cal = new 계산기(); //계산기라는 틀(class)로 cal이라는 계산기 복사
				int result = cal.mul(i1, i2);
				t3.setText("곱한 값은 " + result);
			}
		});
		btnNewButton_2.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(206, 349, 83, 83);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("나누기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기 버튼 클릭됨.");
				String s1 = t1.getText(); //String으로 "200"을 갖다줌.
				String s2 = t2.getText(); //String으로 "100"을 갖다줌.
				System.out.println(s1);
				System.out.println(s2);
				System.out.println("/------");
				//String을 int로 변환해주어야 함.
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1);
				int i2= Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.div(i1, i2);
				t3.setText("나눈 값은 " + result); //setText는 스트링만 들어가는 자리라서 int로 넣으면 에러남
			}
		});
		btnNewButton_1_1.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.GRAY);
		btnNewButton_1_1.setBounds(310, 349, 83, 83);
		f.getContentPane().add(btnNewButton_1_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 18));
		t3.setBackground(Color.RED);
		t3.setBounds(206, 200, 187, 42);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		f.setVisible(true);

	}
}
