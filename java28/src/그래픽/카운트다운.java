package 그래픽;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운트다운 extends JFrame{
	JLabel count, image, day;

	public 카운트다운() { //생성자 메서드
		getContentPane().setBackground(Color.GREEN);
		setSize(800, 300);
		getContentPane().setLayout(null);

		count = new JLabel("count: 500");
		count.setFont(new Font("굴림", Font.BOLD, 55));
		count.setBounds(12, 78, 370, 56);
		getContentPane().add(count);

		image = new JLabel("image");
		image.setBounds(465, 72, 211, 109);
		getContentPane().add(image);
		ImageIcon icon = new ImageIcon("001.PNG");
		image.setIcon(icon);

		day = new JLabel("day");
		day.setFont(new Font("굴림", Font.BOLD, 36));
		day.setBounds(12, 213, 649, 38);
		getContentPane().add(day);
		Date date = new Date();
		day.setText(date + "");

		//count thread
		카운트스레드2 c = new 카운트스레드2();
		c.start();
		날짜스레드2 d = new 날짜스레드2();
		d.start();
		이미지스레드2 i = new 이미지스레드2();
		i.start();

		setVisible(true);
	}
	public static void main(String[] args) {
		카운트다운 t = new 카운트다운();
		
	}// main

	// 변수를 공유해야하는 2개의 클래스가 있다면, 클래스안에 클래스를 낄수 있다.
	// inner class, 내부클래스
	// 내부클래스는 독립적으로 쓸 수 없다.
	public class 카운트스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) { //500초 반복
				count.setText("count : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// 인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}//catch
			}//for
		}//run
	}//inner class
	
	public class 날짜스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				day.setText("날짜 : " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}
		}
	}
	
	public class 이미지스레드2 extends Thread {
		@Override
		public void run() {
			String[] list = { "001.png", "002.png", "003.png", "004.png", "005.png" };
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					// 초를 설정할 때는 밀리세컨즈, 1/1000
					Thread.sleep(5000);

				} catch (InterruptedException e) {
					// 인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}

		}
	}

}// class
