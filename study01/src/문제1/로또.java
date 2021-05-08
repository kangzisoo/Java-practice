package 문제1;

import java.util.Random;

public class 로또 {
	public static void main(String[] args) {
		int[] lotto = new int[6]; //길이가 6인 int배열 생성
		Random r = new Random(); //Random 클래스를 통해 객체 생성
		
		for (int i = 0; i < lotto.length; i++) { //배열 길이만큼 반복
			int num = r.nextInt(45) + 1; //0~44 중 하나의 정수에 1을 더한 값을 num변수에 대입
			lotto[i] = num; //배열의 i번째에 num 대입40 40

			//중복값 체크하기
			for (int j = 0; j < i; j++) { //0부터 (i-1)번째 값 반복
				if(lotto[j] == num) {  //새로 생성된 랜덤값 num이 배열에 존재하면,
					i--; // i--
				}
			} //i++ >> 중복 발생했던 index의 난수 생성부터 다시 실행
		}
		
		//출력
		System.out.print("로또 당첨번호>> ");
		for (int x = 0; x < lotto.length; x++) {			
			System.out.print(lotto[x] + " ");
		}
	
	}
}
