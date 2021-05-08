package yesterday;

public class 기본데이터 {

	public static void main(String[] args) {
		// 자동완성 : Ctrl + 스페이스바
		// sysout, syso
		System.out.println("자바 두번째 날입니다.");

		// 기본데이터 : 정수, 실수, 문자1, 논리형
		// 변수(ram 저장공간), 변수명
		// 자바에서의 저장공간 생성(변수 할당) 시기 : 선언할 때!
		int num = 0; // 들어갈 data type + 변수명; => 선언!
		// 4바이트 (-21억~21억)
		num = 100;

		double eye = 0.0;// 8바이트

		char gender = ' '; // 2바이트
		// 문자1은 '작은따옴표'

		boolean food = false; // 1바이트 (*자바는 최소 1바이트)

		// 변수를 선언할 때는 초기값을 넣어주는 것이 좋다. (초기화)
		System.out.println(num);

		String name = "홍길동";
		// 너무 많이 쓰는 data 형태라서 기본형처럼 사용하게 만들어 놓음

		// 문제1. 네 과목의 평균 구하기
		int pt = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;

		int sum = pt + math + eng + kor;
		// 자바에서 int와 int의 계산은 무조건 int
		// 하나라도 double이면 무조건 double
		
		double avg = (double)sum / 4; // 데이터타입 변경
		// 데이터 타입을 내가 원하는 타입으로 변경하는 것 : 캐스팅!
		// 램에는 원래 타입이 그대로 있고,
		// cpu가 램에 있는 데이터를 가져와서 강제 캐스팅
		// (type명)변수명 => (double)sum
		System.out.println("합계는 " + sum + "점");
		System.out.println("평균은 " + avg + "점");
		
		// 문제2. 원의 면적 구하기
		final double pi = 3.14; // 변경 불가능한 값 final;상수
		double r = 2.2; //변하는 값; 변수
		double area = pi * r * r;
		
		System.out.print("반지름이 "+ r + "인 ");
		System.out.println("원의 면적은 " + area); //println 줄바꿈
		
		double temp = 3.1415926535897;
		System.out.printf("소수점 2자리까지는 %.2f", temp); //printf

	}

}
