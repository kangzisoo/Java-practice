package 조건문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽4 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 40));
		t1.setBounds(241, 61, 279, 85);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		t2.setColumns(10);
		t2.setBounds(241, 157, 279, 85);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 t1, t2 값을 가지고 와야한다.
				// 외부에서 입력한 데이터의 타입은 모두 String!!
				String s1 = t1.getText(); // "200"
				String s2 = t2.getText(); // "100"
				System.out.println(s1 + s2);
				// 자바에서는 +연산자 사용 시 하나라도 String이면 결합의 의미! (ex.200100)
				// String -> int 로 바꿔줘야함.
				// 부품 -> 기본형 간 cpu가 하는 캐스팅은 불가능
				// 캐스팅이 아니라, 바꿔주는 부품을 사용해야 한다.
				int n1 = Integer.parseInt(s1); // "200"->200
				int n2 = Integer.parseInt(s2); // "100"->100
				System.out.println(n1 + n2);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 35));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(158, 285, 259, 59);
		f.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("\uC22B\uC790 1 : ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel.setBounds(42, 78, 185, 50);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC790 2 : ");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(42, 175, 185, 50);
		f.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("\uBE7C\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); // "200"
				String s2 = t2.getText(); // "100"
				// System.out.println(s1 - s2);
				// 자바에서는 +연산자 사용 시 하나라도 String이면 결합의 의미! (ex.200100)
				// String -> int 로 바꿔줘야함.
				// 부품 -> 기본형 간 cpu가 하는 캐스팅은 불가능
				// 캐스팅이 아니라, 바꿔주는 부품을 사용해야 한다.
				int n1 = Integer.parseInt(s1); // "200"->200
				int n2 = Integer.parseInt(s2); // "100"->100
				System.out.println(n1 - n2);

			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 35));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(158, 356, 259, 59);
		f.getContentPane().add(btnNewButton_1);
		f.setSize(600, 600);
		f.setVisible(true);

	}
}
