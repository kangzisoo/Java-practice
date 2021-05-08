package 배열복습;

import java.util.Random;

public class 배열사용1 {

	public static void main(String[] args) {
		// 배열을 사용하는 경우
		// 1. 배열을 만드는 순간 데이터를 모르는 경우
		// 공간을 만들어 두었다가 나중에 넣는다.
		int[] num = new int[5];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); // 0~99
		}

		// 2. 배열을 만드는 순간 데이터를 아는 경우
		// 배열 생성할 때 바로 데이터를 넣는다.
		int[] num2 = { 10, 20, 30, 40, 50 };
		// 값이 들어가 있으면: 기본형 primitive 변수
		// 주소가 들어가 있으면: 참조형 변수 (정수, 실수, 문자, 논리 빼고 다)
		

	}

}
