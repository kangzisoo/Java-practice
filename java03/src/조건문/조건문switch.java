package 조건문;

import java.util.Date;

public class 조건문switch {

	public static void main(String[] args) {
		// 조건이 많을 때 사용, 조건이 특정한 값인 경우
		Date date = new Date();
		int month = date.getMonth() + 1; //2월인데 1월이 찍힘ㅠ +1
		System.out.println(month + "월"); 
		
		// switch(변수) => 정수(int), 문자1, String 만 가능.!
		// 실수(double)는 사용 불가
		switch (month) {
		case 2: //조건이 범위가 아닐때.!
			System.out.println("28일까지 있음");
			break; //switch는 break를 따로 넣어줘야함.
		case 4: case 6: case 9: case 11:
		//9월이면 30일 1번 실행, 11월이어도 30일 1번 실행 후 멈춤
			System.out.println("30일까지 있음");
			break;
		default:
			System.out.println("31일까지 있음");
			break;
		}
		

}
		

}


