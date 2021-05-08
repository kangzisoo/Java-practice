package 정리문제;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 계산기그래픽 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField a4;
	private static JTextField a3;
	private static JTextField a1;
	private static JTextField a2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(46, 35, 147, 49);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(207, 35, 208, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(46, 96, 147, 49);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(207, 96, 208, 49);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); // s1이라는 변수에 t1에 입력받은 값을 넣음
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1); // String s1을 int로 변환
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.add(i1, i2);
				//계산기한테 숫자 두개 더하라고 시킴 (매개변수 i1, i2)
				// result 반환값에 넣음!
				a1.setText("더한 값은 " + result); //String만 가능하므로 result만 넣으면 안됨.
				
			}
		});
		btnNewButton.setBounds(46, 186, 114, 27);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String s1 = t1.getText(); // s1이라는 변수에 t1에 입력받은 값을 넣음
//				String s2 = t2.getText();
//				int i1 = Integer.parseInt(s1); // String s1을 int로 변환
//				int i2 = Integer.parseInt(s2);
				//아래>> 한번에 변수생성 및 타입변환.!
				int i1 = Integer.parseInt(t1.getText());
				int i2 = Integer.parseInt(t2.getText());
				
				계산기 cal = new 계산기();
				int result = cal.minus(i1,i2); //계산기한테 숫자 두개 더하라고 시킴
				// result 반환값에 넣음!
				a2.setText("뺀 값은 " + result); //String만 가능하므로 result만 넣으면 안됨.
			}
		});
		btnNewButton_1.setBounds(46, 225, 114, 27);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("곱하기");
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); // s1이라는 변수에 t1에 입력받은 값을 넣음
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1); // String s1을 int로 변환
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.mul(i1,i2); //계산기한테 숫자 두개 더하라고 시킴
				// result 반환값에 넣음!
				a3.setText("곱한 값은 " + result); //String만 가능하므로 result만 넣으면 안됨.
			}
		});
		btnNewButton_2.setBounds(46, 264, 114, 27);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("나누기");
		btnNewButton_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); // s1이라는 변수에 t1에 입력받은 값을 넣음
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1); // String s1을 int로 변환
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.div(i1, i2); //계산기한테 숫자 두개 더하라고 시킴
				// result 반환값에 넣음!
				a4.setText("나눈 값은 " + result); //String만 가능하므로 result만 넣으면 안됨.
			}
		});
		btnNewButton_1_1.setBounds(46, 303, 114, 27);
		f.getContentPane().add(btnNewButton_1_1);
		
		a4 = new JTextField();
		a4.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		a4.setBounds(207, 304, 208, 26);
		f.getContentPane().add(a4);
		a4.setColumns(10);
		
		a3 = new JTextField();
		a3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		a3.setColumns(10);
		a3.setBounds(207, 265, 208, 26);
		f.getContentPane().add(a3);
		
		a1 = new JTextField();
		a1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		a1.setColumns(10);
		a1.setBounds(207, 187, 208, 26);
		f.getContentPane().add(a1);
		
		a2 = new JTextField();
		a2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		a2.setColumns(10);
		a2.setBounds(207, 226, 208, 26);
		f.getContentPane().add(a2);
		
		
		
		f.setVisible(true);

	}
}
