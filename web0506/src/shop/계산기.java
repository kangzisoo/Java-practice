package shop;

import java.util.Date;

public class 계산기 {
	public int getHour() {
		Date date = new Date(); // ctrl + shift + o = import추가
		int result = date.getHours(); // 12
		return result;
	}

	public int add(int x, int y) { 
		// 매개변수=파라미터 2개(x, y, add라는 함수 안에서만 사용할 수 있는 지역변수)
		// 메서드 안에서 선언된 변수는 메서드 안에서만 사용 가능
		// 메서드 범위 지역 안에서만 사용 가능
		// 지역변수, 로컬변수 <--> 전역변수, 글로벌변수
		int result = x + y;
		System.out.println(result);
		return result;
	}

	public int minus(int x, int y) {
		int result = x - y;
		System.out.println(result);
		return result;
	}

	public int mul(int x, int y) {
		int result = x * y;
		System.out.println(result);
		return result; // return은 맨 끝줄에 나와야함!!
		// return 있는 경우 void 불가.!
		// 기본형(int,double,char,boolean), 참조형 다 가능
	}

	public int div(int x, int y) {
		int result = x / y;
		System.out.println(result);
		return result; // return은 맨 끝줄에 나와야함!!
	}
}
