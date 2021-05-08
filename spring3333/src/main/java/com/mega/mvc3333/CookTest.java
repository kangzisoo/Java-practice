package com.mega.mvc3333;

public class CookTest  {

	public static void main(String[] args) {
		// 기능을 동작시킴
		KoreanCook k = new KoreanCook();
		k.makeRice();
		ChineseCook c = new ChineseCook();
		c.makeSalad();
		CookManager m = new CookManager(null);
		m.orderRice();
		
	}

}
