package 반복문;

import java.util.Random;

public class 아무숫자 {

	public static void main(String[] args) {
		// 랜덤
		Random r = new Random();
		int num = r.nextInt(100); // -21억~21억
		System.out.println(num);
	}

}
