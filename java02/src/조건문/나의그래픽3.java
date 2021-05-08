package 조건문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;

public class 나의그래픽3 {
	private static JTextField t1;
	private static JTextField t2;
	private static JButton btnNewButton;

	public static void main(String[] args) {
		// 아래 세줄로 책상 만들고 시작! >> 오른쪽마우스 + openwith + 윈도우빌더에디터 + Design
//		JFrame f = new JFrame();
//		f.setSize(600, 800);
//		f.setVisible(true);
		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.ITALIC, 30));
		t1.setBounds(208, 59, 286, 81);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.ITALIC, 30));
		t2.setColumns(10);
		t2.setBounds(208, 163, 286, 81);
		f.getContentPane().add(t2);
		//
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1) 입력한 t1, t2 값을 가지고 와야한다.
				//	 외부에서 입력한 데이터의 타입은 모두 String.!
				String s1 = t1.getText(); //"root"
				String s2 = t2.getText(); //"1234"
				// 2) 내가 지정한 아이디, 패스워드와 동일한지 확인한다.
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
				// 3) 결과를 출력한다.				
				
			}
		});
		//		
		
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(116, 268, 286, 75);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC544 \uC774 \uB514 : ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(69, 74, 125, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC : ");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(69, 176, 125, 50);
		f.getContentPane().add(lblNewLabel_1);
		f.setVisible(true);
		
	}
}
