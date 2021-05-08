package 문제3;

import java.util.Scanner;

public class 사람 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//스캐너 객체 생성하고, 입력한 값을 바이트 단위로 읽어오도록 함.
		System.out.print("문장을 입력하세요 >> ");
		String str = scan.nextLine(); //엔터 전까지의 문자를 입력받음
		String[] strlist = str.split(" ");
		int count = 0;
		for (int i = 0; i < strlist.length; i++) {
			if(strlist[i].contains("사람"))
				count++;
		}
		System.out.println("사람(" + count +")");
		

	}

}
