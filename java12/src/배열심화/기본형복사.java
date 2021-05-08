package 배열심화;

public class 기본형복사 { //깊은 복사

	public static void main(String[] args) {
		int x = 100;
		int y = x; //기본형 복사
		System.out.println("변경 전 x: " + x);
		System.out.println("변경 전 y: " + y);
		x = 200;
		System.out.println("변경 후 x: " + x);
		System.out.println("변경 후 y: " + y);
		

	}

}
