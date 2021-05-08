package 거스름돈;

import java.io.BufferedReader; //BufferedReader를 사용하기 위해 import
import java.io.InputStreamReader; //BufferedReader를 사용하기 위해 import

public class Solution03 {
	public static void main(String[] args) throws Exception { ///BufferedReader를 사용하기 위해 예외처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //객체 생성
		System.out.print("상품의 가격을 입력하세요.(1000원 이하)>> ");
		int input = Integer.parseInt(br.readLine()); //String으로 엔터까지 입력받은 후 int로 변환
		int change = 1000 - input; //1000원을 지불했을 때 잔돈
		System.out.println("거스름돈은 "+ change +"원 입니다.");
		
		int[] coin = {500, 100, 50, 10}; //잔돈을 구성할 동전 종류
		int[] result;
		result = new int[4]; //동전의 갯수를 담을 결과 배열 생성
		
		for (int i = 0; i < coin.length; i++) {// 500원짜리 동전부터 10원짜리까지 순서대로
			if(change >= coin[i]) { //잔돈이 각 동전하나 가격보다 크면,
				result[i] = change/coin[i]; //result(정수값) = 몫 = 동전의 갯수
				change = change%coin[i]; // 처리 후 나머지 잔돈
			}
			
			System.out.print(result[i] + " ");
		}
	}
}
