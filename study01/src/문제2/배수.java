package 문제2;

public class 배수 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 && i%5==0) //3과 5의 공배수   * &, && 차이
				System.out.println("짱킹");
			else if(i%3==0) //3의 배수
				System.out.println("짱");
			else if(i%5==0) //5의 배수
				System.out.println("킹");
			else 
				System.out.println(i);
		}
	}

}
