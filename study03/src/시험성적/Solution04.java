package 시험성적;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//국어 영어 수학 순으로 점수 입력 (각 과목 당 100점 만점)
		System.out.print("국어 영어 수학 순으로 점수를 입력하세요 >> ");
		double 국어 = scan.nextInt();
		double 영어 = scan.nextInt();
		double 수학 = scan.nextInt();
		
		//평균
		double 평균 = (국어+영어+수학)/3.0;
		//소수점 2번째 자리 까지만 출력
		DecimalFormat df = new DecimalFormat("0.00");
		String 평균2 = df.format(평균);
		
		
		System.out.print("평균 등급 >> " + 평균2 + " ");
		//등급
		if (평균 >= 90) {
			System.out.println("A");
		}else if (평균 >= 80) {
			System.out.println("B");
		}else if (평균 >= 70) {
			System.out.println("C");
		}else if (평균 >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
