package java28;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic3 extends JFrame {
	// JFrame이 가지고 있던 메서드, 멤버변수 모두 상속받아 ThreadGraphic3 클래스 생성
	// ThreadGraphic3에서 JFrame의 것을 다 쓸 수 있음.
	JLabel count, image, day; // 변수 선언 (변수를 만드는 것)
	//다른 클래스와 변수를 공유해야하기 때문에 생성자 밖으로 꺼내줌 -> 전역변수

	public ThreadGraphic3() {
	//open메서드 없이 객체 생성하자마자 뜨게하고 싶으면 함수이름 그대로 => 생성자.!
	//or 메서드 사용 => public void open() {
		setSize(800, 300);
		
		count = new JLabel("counter들어갈 부분"); //count 주소에 라벨을 생성
		image = new JLabel("이미지 들어가는 라벨 부분"); //image 주소에 라벨 생성
		day = new JLabel("타이머 들어가는 라벨 부분"); //day주소에 라벨 생성
		
		add(count, BorderLayout.WEST); //부품 layout 정의
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		
		Font font = new Font("궁서", Font.BOLD, 50); //font정의; 세 매개변수 다 들어가야 설정 가능.!
		count.setFont(font); //font 적용
		day.setFont(font); //font 적용
		
		Count2 count2 = new Count2(); //Count2 클래스로부터 객체 생성
		count2.start(); //cpu한테 실행하라고 명령

		Day2 d2 = new Day2();//Day2 클래스로부터 객체 생성
		d2.start(); //cpu한테 실행하라고 명령
		
		Image2 image = new Image2();//Image2 클래스로부터 객체 생성
		image.start(); //cpu한테 실행하라고 명령
		
		
		setVisible(true);
	}
	// 파라메터 생성자, 생성자 오버로딩
	
	//클래스 안의 전역변수를 공유할 목적으로 내부에 끼워넣는 클래스
	//내부클래스(=inner class)
	public class Count2 extends Thread { //카운트클래스 이너클래스로 가져옴
		@Override //재정의
		public void run(){
			for (int i = 500; i >= 0; i--) { //i가 500 ~ 0까지 1씩 줄어들며 반복
//				System.out.println("count : " + i);
				count.setText("count : " + i); //count 라벨에 텍스트 입력
				try {
					Thread.sleep(500); //0.5초 마다 실행
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}
		}
	}
	public class Day2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) { //i=0 ~999 까지 1씩 증가하며 반복
				Date date = new Date(); //Date클래스로부터 객체 생성
				day.setText("내부 날짜: " + date);  //day 라벨에 텍스트 및  date 입력
				try {
					Thread.sleep(1000); // 1초마다 실행
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}
		}
	}
	public class Image2 extends Thread {
		@Override
		public void run() {
			// 이미지 파일이 들어있는 list 생성
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length; i++) { // i=0부터 list의 길이만큼 반복
				ImageIcon icon = new ImageIcon(list[i]); //파일을 이미지로 인식하도록 함
//				image.setText("이미지: " + list[i]);
				image.setIcon(icon); //image 라벨에 이미지 뜨도록 셋팅
				try {
					//초를 설정할 때는 밀리세컨즈, 1/1000설정.
					Thread.sleep(5000); //5초마다 실행
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}
		}
	}
}
