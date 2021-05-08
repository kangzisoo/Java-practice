package 스레드복습;

import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ThreadTest extends JFrame {
	// JFrame의 메서드, 멤버변수 상속받아 사용 가능

	JLabel day, img, name; //생성자 바깥에서 각 라벨 변수 선언

	public ThreadTest() {
		getContentPane().setBackground(Color.ORANGE); //new로 객체 생성시 자동 호출되도록 => 생성자
		setSize(900, 900); //프레임 만들어줌
		getContentPane().setLayout(null);

		day = new JLabel(""); //day라는 라벨 생성
		day.setHorizontalAlignment(SwingConstants.CENTER);
		day.setFont(new Font("나눔바른고딕", Font.PLAIN, 30));
		day.setBounds(38, 75, 783, 70);
		getContentPane().add(day);

		img = new JLabel(""); //img라는 라벨 생성
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setBounds(81, 78, 712, 712);
		getContentPane().add(img);

		name = new JLabel("");//name이라는 라벨 생성
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("나눔바른고딕", Font.BOLD, 50));
		name.setBounds(51, 679, 783, 134);
		getContentPane().add(name);

		Day d = new Day();// Day2 클래스로부터 객체 생성
		d.start(); // cpu한테 실행하라고 명령
		
		Img i = new Img(); //객체 생성
		i.start(); //실행
		
		Name n = new Name(); //객체생성
		n.start(); //실행

		setVisible(true);
	}

	public static void main(String[] args) { //메인
		ThreadTest test = new ThreadTest(); //생성자 호출해줌
	}

	public class Day extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date(); // Date 클래스에서 date 가져오기
				day.setText("" + date); // String으로 바꿔주기위해 " " 필요
				try {
					Thread.sleep(1000); // 1초
				} catch (InterruptedException e) {
					// 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
					e.printStackTrace();
				}
			}
		}
	}

	public class Name extends Thread { // 카운트클래스 이너클래스로 가져옴
		@Override //재정의
		public void run(){
			//이름을 담을 리스트 생성
			String[] list1 = { "감초", "독버섯", "라떼", "세인트릴리", "아몬드", "커스터드", "클로버", "퓨어바닐라", "호밀", "홀리베리" };
		
		for(int i = 0; i<list1.length; i++) {
				name.setText(list1[i] + " 쿠키");
				//리스트 전체 반복 후 처음으로 돌아가기 위해 필요한 초기화조건문
				if (i == 9) { 
					i = -1; 
					//i가 0~9까지 반복 >> i= -1로 만들어준 후 >> i++ 이 실행되면서 i= 0이 됨
				}
				try {
					Thread.sleep(1000); //1초
					} catch (InterruptedException e) {
						// 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
						e.printStackTrace();
					}
		}}}
		
	
	public class Img extends Thread { 
		@Override
		public void run() {
			//이미지를 담을 리스트 생성
			String[] list2 = { "감초.png", "독버섯.png", "라떼.png", "세인트릴리.png", "아몬드.png", "커스터드.png", "클로버.png", "퓨어바닐라.png", "호밀.png", "홀리베리.png" };
			
			for (int i = 0; i < list2.length; i++) {
				ImageIcon icon = new ImageIcon(list2[i]); //파일을 이미지로 인식하도록 함
				img.setIcon(icon); //img 라벨에 이미지 뜨도록 셋팅
				if (i == 9) {
					i = -1;
					//i가 0~9까지 반복 >> i= -1로 만들어준 후 >> i++ 이 실행되면서 i= 0이 됨
				}
				try {
					Thread.sleep(1000); //1초
				} catch (InterruptedException e) {
					// 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
					e.printStackTrace();
				}
			}
		}}}

