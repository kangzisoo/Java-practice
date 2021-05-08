package pack02;

import java.util.Random;

public class test02 {

	public static void main(String[] args) {
		//Random 라이브러리를 활용하여 랜덤한 값 10개를 발생시켜서 프린트
		int[] num = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < num.length; i++) { //0~9까지 수 중 random값을 발생시켜 길이가 10인 배열에 넣는다.
			num[i] = r.nextInt(10);
			System.out.print(num[i] + " ");
		}
		System.out.println();
		//위 에서 생성한 랜덤한 값 10개를 모두 반복문을 통해서 더해서 프린트
		int sum = 0;
		for (int i : num) {  //sum 변수를 생성해서 배열 안의 값들을 다 더한다.
			sum = sum + i;
		}
		System.out.println("생성된 랜덤 값 10개의 합은 " + sum);
		
		//더한 값의 평균을 구해서 프린트
		double avg = (double)sum/10; //평균 구하기 전 int인 sum 값을 double로 바꿔준다.
		System.out.println("생성된 랜덤 값 10개의 평균은 " + avg);

	}

}
