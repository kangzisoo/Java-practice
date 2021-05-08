package 문제3;

import java.util.Scanner;

public class 알파벳 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//스캐너 객체 생성하고, 입력한 값을 바이트 단위로 읽어오도록 함.
		System.out.print("알파벳을 입력하세요 >> ");
		String str = scan.next(); //공백 전까지의 문자를 입력받음
		char[] ch = str.toCharArray(); //입력받은 값을 문자 배열로 변환
		//문자 수를 셀 변수 생성
		int counta = 0;
		int countb = 0;
		int countc = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a') {
				counta++;
			} else if(ch[i]=='b') {
				countb++;
			} else if(ch[i]=='c') {
				countc++;
			} 
		}
		System.out.print("a(" + counta + "),");
		System.out.print("b(" + countb + "),");
		System.out.print("c(" + countc + ")");

	}

}
