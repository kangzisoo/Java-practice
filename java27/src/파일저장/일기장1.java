package 파일저장;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장1 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("일기쓰는 화면");
	      //static 변수: 객체생성하지 않아도 언제든 클래스이름으로 접근해서
	      //            바로 그 변수의 값을 가져다 쓸 수 있는 변수
	      //            그래픽 프로그램에서는 Font의 속성, Color의 값 등을
	      //            자주 쓰므로 static변수로 만들어두어서 편하게
	      //            언제든 쓸 수 있음.
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(14, 153, 101, 35);
		f.getContentPane().add(lblNewLabel);
		JTextArea t3 = new JTextArea();
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(14, 200, 101, 35);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 내용");
		lblNewLabel_1_1.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(14, 256, 101, 35);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		t1.setBounds(120, 153, 198, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(38, 406, 250, 35);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();//날짜
				String s2 = t2.getText();//날짜
				String s3 = t3.getText();//날짜
				
				try {
					//해당 폴더와 스트림(연결=통로)을 만든다.
					//스트림의 특징은 한방향!!
					FileWriter file = new FileWriter("d:/data/" + s1 + ".txt");
					//절대경로 : 위치를 나타낼때 맨 앞에서부터 쭉 써주는 경로
					//상대경로 : 현재위치를 기준해서 상대적으로 써주는 경로
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					file.close(); //스트림을 다 쓴 후 반드시 자원 해제 해줘야 함.!
					JOptionPane.showMessageDialog(f, "파일에 저장 성공.");

				} catch (IOException e2) {
					System.out.println("파일로 저장 중 에러발생");
					System.out.println("에러 정보는 " + e2.getMessage());
				}
			}
		});
			
		f.getContentPane().add(btnNewButton);
		
		t3.setLineWrap(true);
		t3.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		t3.setRows(5);
		t3.setBounds(120, 259, 198, 124);
		f.getContentPane().add(t3);
		
		t2 = new JTextField();
		t2.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(120, 206, 198, 35);
		f.getContentPane().add(t2);
		
		JLabel top = new JLabel("");
		top.setBounds(26, 12, 281, 129);
	    f.getContentPane().add(top);
	      
	    ImageIcon icon = new ImageIcon("top.PNG");
	    top.setIcon(icon);
		
	
		f.getContentPane().add(top);
		f.setSize(350, 500);
		f.setVisible(true);

	}
}
