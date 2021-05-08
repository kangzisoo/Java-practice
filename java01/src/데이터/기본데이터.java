package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {
		// 기본데이터 4가지
		// 정수, 실수, 문자1, 논리
		// 문자1(Char), 문자여러개(String)
		int age = 100;		//4 byte
		double eye = 1.5;	//8 byte
		char gender = '여';
		boolean food = true; //자바는 소문자, 파이썬은 True
		
		// Ctrl + Shift + F : 자동포맷팅
		// Ctrl + 스페이스바 : 자동완성
		// sysout, syso
		System.out.println("내 시력은 "+eye); //타입 달라도 됨 (파이썬만 타입에 엄격)
		// Ctrl + F11 : 실행
		System.out.println("내 나이는 "+age);
		System.out.println("내 성별은 " + gender);
		System.out.println("식사 여부? " + food);
	}

}
