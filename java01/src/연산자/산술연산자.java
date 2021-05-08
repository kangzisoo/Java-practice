package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// +, -, *, /, %
		// 한줄 복사 : Ctrl + Alt + 화살표아래
		// 한줄 이동(옮기기) : Alt + 화살표방향(위/아래)
		// 이전꺼 취소 : Ctrl + z
		// 한줄 삭제 : Ctrl + d
		int x = 200;
		int y = 100;

		// 연산 : cpu가 하는 간단한 처리
		// 연산자(기호) : 간단한 처리는 코딩 상에 기호로 표시
		int sum = x + y; // 실행순서 sum, x+y, =
		System.out.println(x + " + " + y + " = " + sum);
		int minus = x - y;
		System.out.println(x + " - " + y + " = " + minus);
		int mul = x * y;
		System.out.println(x + " * " + y + " = " + mul);
		int div = x / y;
		System.out.println(x + " / " + y + " = " + div);
		int odd = x % y;
		System.out.println(x + " % " + y + " = " + odd);
	}

}
