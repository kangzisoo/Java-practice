package 조건문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class 나의그래픽2 {
	private static JTextField t1;

	public static void main(String[] args) {
		// 아래 세줄로 책상 만들고 시작! >> 오른쪽마우스 + openwith + 윈도우빌더에디터 + Design
//		JFrame f = new JFrame();
//		f.setSize(600, 800);
//		f.setVisible(true);
		JFrame f = new JFrame();
		f.setSize(600, 800);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		JButton b1 = new JButton("New button");	//수동으로 고쳐주기..?
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				JOptionPane.showMessageDialog(f, "버튼을 누르셨군요");
				String s1 = t1.getText();//"홍길동"
				JOptionPane.showMessageDialog(f, "당신의 입력값은 " + s1);
			}
		});
		
		b1.setFont(new Font("Dialog", Font.PLAIN, 30));
		f.getContentPane().add(b1, BorderLayout.CENTER);
		f.setVisible(true);
		
	}

}
