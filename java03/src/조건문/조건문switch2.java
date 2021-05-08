package 조건문;

import java.util.Date;

public class 조건문switch2 {

	public static void main(String[] args) {
		// 조건이 많을 때 사용, 조건이 특정한 값인 경우
		// 문제
		String food = "분식";
		
		switch (food) {
		case "분식":
			System.out.println("길건너로");
			break;
		case "양식":
			System.out.println("왼쪽으로");
			break;
		case "한식":
			System.out.println("오른쪽으로");
			break;
		default:
			System.out.println("집에서");
			break;
		}
		
		
	}
		

}


