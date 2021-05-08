package 배열응용;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		// 문제 990 답안, 내 답
		Random r = new Random();
		
		int[] 답안 = new int[990];
		int[] 내답 = new int[990];
		//1~4까지의 값을 두 배열에 넣어보세요.
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1; //1~4
			내답[i] = r.nextInt(4) + 1;
		}
		
		//프린트
		System.out.println("번호:답안     내답");
		for (int j = 0; j < 내답.length; j++) {
			System.out.println(j + " : " + 답안[j] + " <-> " + 내답[j]);
			
		}
		//채점
		int count = 0; // 내답과 답안이 일치
		for (int i = 0; i < 내답.length; i++) {
			if(내답[i] == 답안[i]) {
				count++;
			} 
		}
		System.out.println(count + "점 입니다.");
		
	}

}
