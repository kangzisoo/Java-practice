package pack02;

public class Test01 {

	public static void main(String[] args) {
		// int값이 1000개 들어갈 수 있는 배열을 선언하고,
		int[] num = new int[1000];
		// 첫번째 위치에 100
		num[0] = 100;
		// 다섯번째 위치에 200
		num[4] = 200;
		// 열번째 위치에 300
		num[9] = 300;
		// 마지막 위치에 500을 넣으시오
		num[999] = 500;
		// 배열에 들어있는 값들의 개수를 프린트하시오
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				continue;
			} else {
				count++;
			}
		}
		System.out.println("배열에 들어있는 값들의 개수는 " + count);
		// 배열에 넣었던 첫번째, 다섯번째, 열번째, 마지막위치의 값들을 프린트하시오
		int countlist[] = new int[1000];

		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				continue;
			} else {
				countlist[i] = num[i];
				System.out.println(i + 1 + "번째 위치: " + countlist[i]);
			}
		}

	}

}
