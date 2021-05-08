package 문제1;

public class 구구단 {//이중 for문을 이용하여 구구단 찍기

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("구구단 " + i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println("");
		}
	}

}
