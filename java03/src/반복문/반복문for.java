package 반복문;

public class 반복문for {
	// range(0:5) => 0, 1, 2, 3, 4
	public static void main(String[] args) {
//		int[] num = new int[1000];
		
		for (int i = 0; i < 100000; i++) { //십만번 돌리는데 2초? 빠르다.
			System.out.println("win");
		}
		//	  시작값		조건식    증감식
		for (int i = 0; i < 5; i++) { 
			System.out.println(i + " 나는 프로그래머");
		} //실행순서 : 시작값 > 조건식 > 실행 > 증감식
	}

}
