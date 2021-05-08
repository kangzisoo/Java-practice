package 조건문;

import java.util.Date;

import javax.swing.JButton;

public class 조건문if {

	public static void main(String[] args) {
		
		// 문제1.
		// new키워드를 이용해서 Date틀에 대한 부품을 찍어냄.
		Date date = new Date(); //날짜와 시간에 대한 정보를 알려주는 class
		//짧은 틀의 경우 주로 그 틀의 소문자로 변수 선언함 (date)
		int hour = date.getHours(); //현재 시스템 시간 가져옴
		System.out.println("현재 시각은 " + hour + "시");
		
		//범위를 가지고 조건 체크할때는 if~elseif~elseif~~
		//조건이 true이면, 실행하고 거기서 break.!
		if (hour <= 11) {
			System.out.println("굿모닝");
		} else if (hour <= 16) {
			System.out.println("굿애프터눈");
		} else if (hour <= 22) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
		
	}

}
