package 배열심화;

public class 참조형복사 {

	public static void main(String[] args) {
		int[] x = {100, 200, 300}; //생긴 변수는 5개 (Read only까지)
		// x: 주소 (참조형)
		//x에 들어있는 주소로 각 값들에 인덱스로 접근.!
		System.out.println(x.length); //read only
		
//		int[] y = x; //얕은 복사 => 배열의 주소만 복사 (쉘로우카피)
		int[] y = x.clone(); //깊은 복사 => 배열의 주소가 가리키는 값들의 목록을 복사 (딥카피)

		System.out.println("x의 주소 : " + x);
		System.out.println("y의 주소 : " + y); //얕은 복사 하면 x주소 복사, 깊은 복사 하면 새 주소 생성
		System.out.println("--------------------");
		
		System.out.print("변경 전 x: ");
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.print("변경 전 y: ");
		for (int a : y) {
			System.out.print(a + " ");
		}
		System.out.println("\n--------------------");
		
		x[0] = 999;
		
		System.out.print("변경 후 x: ");
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.print("변경 후 y: ");
		for (int a : y) {
			System.out.print(a + " ");
		}
		
		
		System.out.println("\n--------------------");
		System.out.println("x의 주소 : " + x);
		System.out.println("y의 주소 : " + y);
		
		//깊은 복사!

	}

}
