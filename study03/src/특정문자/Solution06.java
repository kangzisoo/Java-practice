package 특정문자;

import java.util.Scanner;

public class Solution06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장(50자 이내)을 입력하세요.>> ");
		String input = scan.nextLine();
		System.out.print("입력된 문장 내 개수를 구하고 싶은 문자를 입력하세요.>> ");
		char x = scan.next().charAt(0);
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == x) {
				count++;
			}//if문 끝
		}//for문 끝
		System.out.println(count);

	}

}
