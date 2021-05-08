package 문제3;

import java.util.Scanner;

public class 사람2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//스캐너 객체 생성하고, 입력한 값을 바이트 단위로 읽어오도록 함.
		System.out.print("문장을 입력하세요 >> ");
		String str = scan.nextLine(); //엔터 전까지의 문자를 입력받음
		String[] strlist = str.split(", | ");
		int count나는 = 0;
		int count너도 = 0;
		int count우리도 = 0;
		int count모두다 = 0;
		int count사람 = 0;
		for (int i = 0; i < strlist.length; i++) {
			if(strlist[i].equals("나는")) 
				count나는++;
			else if(strlist[i].equals("너도")) 
				count너도++;
			else if(strlist[i].equals("우리도")) 
				count우리도++;
			else if(strlist[i].equals("모두다")) 
				count모두다++;
			else if(strlist[i].equals("사람")) 
				count사람++;
		}
		System.out.print("나는(" + count나는 +"),");
		System.out.print("너도(" + count너도 +"),");
		System.out.print("우리도(" + count우리도 +"),");
		System.out.print("모두다(" + count모두다 +"),");
		System.out.print("사람(" + count사람 +")");
		

	}

}
