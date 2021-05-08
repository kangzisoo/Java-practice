package 뱀이지나간자리;

import java.util.Scanner;

public class Solution02 {

	public static void main(String[] args) {
		// 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("평면의 크기를 입력하세요.(N행*M열 / 단, 3이상 100이하의 정수)>> ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		// N과 M의 범위 체크
		if (n >= 3 && n <= 100 && m >= 3 && m <= 100) {
		// 출력
			for (int i = 1; i <= n; i++) { //1행부터 시작
				if (i%4 == 0) { //4의 배수 행이면 왼쪽 한칸만 #
					for (int j2 = 0; j2 < 1; j2++) {
						System.out.print("#");
					}
					for (int j2 = 1; j2 < m; j2++) {
						System.out.print(".");
					}
					System.out.println("");
				}else if(i%2 == 0){ //2의 배수 행이면 오른쪽 한칸만 #
					for (int j2 = 0; j2 < m-1; j2++) {
						System.out.print(".");
					}
					for (int j2 = m-1; j2 < m; j2++) {
						System.out.print("#");
					}
					System.out.println("");
				}else { //홀수 행이면 행 전체 ####
					for (int j = 0; j < m; j++) {
						System.out.print("#");
					}
					System.out.println("");
				}
			}//for문 끝 (행)
		}//if문 끝 (n,m의 범위)
		else {
			System.out.println("3이상 100이하의 정수가 아닙니다.");
		}
		scan.close();
	}

}
