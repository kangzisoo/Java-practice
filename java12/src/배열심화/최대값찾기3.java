package 배열심화;

import java.util.Random;

public class 최대값찾기3 {

	public static void main(String[] args) {
		// 타입이 동일한 많은 양의 데이터가 있으면 배열에 넣으세요.
		// 반복을 통해서 많은 양의 데이터를 효율적으로 다룰 수 있음.
		int[] num = new int[1000];
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		
//		int[] num = {11, 33, 55, 22, 44};
		int max = num[0]; //오류를 방지한 초기화 방법.!
		int index = 0;
		int count = 0;
		for (int i = 1; i < num.length; i++) { //0번(자기자긴)과는 비교할 필요 없으므로, i=1부터 시작하게
			if (max < num[i]) {
				max = num[i];
				index = i;
				count++;
			}
		}
		System.out.print("index"+ index + "에 ");
		System.out.println("최대값 " + max +" 위치함.");
		System.out.println(count);

	}

}
