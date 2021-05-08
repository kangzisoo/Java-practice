package 조건문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class 나의그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();	//*초기에 입력하는 라인1
		// 책상 생성하기 (프레임)
//		JButton b1 = new JButton();
//		JButton b2 = new JButton();
//		JButton b3 = new JButton();
		f.setSize(500, 500);	//*초기에 입력하는 라인2
		// 책상 사이즈
		
		JButton btnNewButton = new JButton("\uAC00\uC6B4\uB370 \uBC84\uD2BC");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton.setForeground(Color.WHITE);
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uB3D9\uCABD\uBC84\uD2BC");
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("\uC11C\uCABD\uBC84\uD2BC");
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("\uB0A8\uCABD\uBC84\uD2BC");
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("\uBD81\uCABD\uBC84\uD2BC");
		f.getContentPane().add(btnNewButton_4, BorderLayout.NORTH);
		f.setVisible(true);		//*초기에 입력하는 라인3
		// 책상에 올린거 다 보여줘. (꼭 맨 끝줄에!)
		

	}

}
