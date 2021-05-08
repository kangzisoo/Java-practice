package 배열기본;

import java.util.Random;

public class 로또만들기 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random(2);//아무숫자(seed값)쓰면 고정된 랜덤값;
		for (int i = 0; i < lotto.length; i++) { //6번반복
			lotto[i] = r.nextInt(45)+1;//(44+1)까지 중 랜덤			
		}
		for (int x : lotto) {
			System.out.print(x + " ");
		}
		System.out.println();
		int count = 0;
		for (int x : lotto) {
			if(x >= 30) {
				count++;
			}
		}
		System.out.println(count);
		
		//import 생성: 자동완성, 마우스올리기, F2누르기
		//많은 양의 자동import: Ctrl + Shift + o(영문)
		
//		토익문제채점 name = new 토익문제채점();
//		다른패키지클래스 name2 = new 다른패키지클래스();
		

	}

}
