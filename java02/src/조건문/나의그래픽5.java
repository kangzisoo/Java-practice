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
import java.awt.BorderLayout;

public class 나의그래픽5 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBA39\uACE0 \uC2F6\uC740 \uC74C\uC2DD");
		lblNewLabel.setFont(new Font("나눔바른고딕", Font.BOLD, 30));
		lblNewLabel.setBounds(50, 42, 197, 56);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("나눔바른고딕", Font.PLAIN, 35));
		t1.setBackground(Color.ORANGE);
		t1.setBounds(274, 42, 254, 56);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //짬뽕,라면,초밥 
				String go = " ";

				if (s1.equals("짬뽕")) {
			         go = "중국집으로";
			      } else if (s1.equals("초밥")) {
			         go = "일식집으로";
			      } else if (s1.equals("라면")) {
			         go = "분식집으로";
			      } else {
			         go = "편의점으로";
			      }
				JOptionPane.showMessageDialog(f, go);

			}
		});
		btnNewButton.setFont(new Font("나눔바른고딕", Font.ITALIC, 30));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(116, 110, 323, 56);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
		lblNewLabel_1.setFont(new Font("나눔바른고딕", Font.BOLD, 30));
		lblNewLabel_1.setBounds(50, 198, 197, 56);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("나눔바른고딕", Font.PLAIN, 35));
		t2.setColumns(10);
		t2.setBackground(Color.ORANGE);
		t2.setBounds(274, 198, 254, 56);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_1 = new JButton("\uB2F9\uC2E0\uC758 \uB0B4\uB144 \uB098\uC774\uB294?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText(); //"100"
				int n2 = Integer.parseInt(s2); //100
				JOptionPane.showMessageDialog(f, n2 + 1);
				
				
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("나눔바른고딕", Font.ITALIC, 30));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(116, 266, 323, 56);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uAD6D\uC5B4 \uC810\uC218");
		lblNewLabel_1_1.setFont(new Font("나눔바른고딕", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(50, 355, 197, 56);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("나눔바른고딕", Font.PLAIN, 35));
		t3.setColumns(10);
		t3.setBackground(Color.ORANGE);
		t3.setBounds(274, 355, 254, 56);
		f.getContentPane().add(t3);
		
		JButton btnNewButton_1_1 = new JButton("\uB450 \uACFC\uBAA9 \uC810\uC218 \uD3C9\uADE0\uC740?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText(); //90
				String s4 = t4.getText(); //80
				int n3 = Integer.parseInt(s3);
				int n4 = Integer.parseInt(s4);
				JOptionPane.showMessageDialog(f, (n3 + n4) / 2);
			}
		});
		btnNewButton_1_1.setForeground(Color.BLUE);
		btnNewButton_1_1.setFont(new Font("나눔바른고딕", Font.ITALIC, 30));
		btnNewButton_1_1.setBackground(Color.GRAY);
		btnNewButton_1_1.setBounds(116, 485, 323, 56);
		f.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC218\uD559 \uC810\uC218");
		lblNewLabel_1_1_1.setFont(new Font("나눔바른고딕", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(50, 423, 197, 56);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t4 = new JTextField();
		t4.setFont(new Font("나눔바른고딕", Font.PLAIN, 35));
		t4.setColumns(10);
		t4.setBackground(Color.ORANGE);
		t4.setBounds(274, 423, 254, 56);
		f.getContentPane().add(t4);
		f.setSize(600, 600);
		f.setVisible(true);
		
		}
	}
