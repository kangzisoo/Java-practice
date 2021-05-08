package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌	acc = new 계좌();
		acc.name = "홍길동";
		acc.name = "식비";
		acc.type = "적금";
		acc.money = 30000;
		System.out.println(acc);
		
		
		acc.예금하다(acc.name, acc.money);
		acc.예금하다("home", "적금", 50000);
		acc.출금하다(20000);
		
	}
	
	

}
