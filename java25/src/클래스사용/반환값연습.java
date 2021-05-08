package 클래스사용;

import java.util.Date;

public class 반환값연습 {
	public int add(int x, int y) {
		return x + y;
	}
	public double add(double x, int y) {
		return x + y;
	}
	public String add(String x, String y) {
		return x + y;
	}
	public String add(int x, String y) {
		return x + y;
	}
	public int[] add() {
		int[] x = {1,2,3};
		return x;
	}
	public void add2() {
		System.out.println("더하기 기능을 수행합니다.");
	}
	public Date getDate() { //**Date 타입으로 넘겨줌.!
		Date date = new Date(); //new 객체가 생기면 반드시 주소가 생긴다.
		return date;
	}

}
