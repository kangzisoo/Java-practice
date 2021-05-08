package 반복문;

import java.util.Date;

import javax.swing.JOptionPane;

public class 반복문while2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		int sum = 0;
		int count = 0;
		// while문 '밖'에서 변수를 선언 및 초기화 해줘야함.!

		while (true) {
			String data = JOptionPane.showInputDialog("점수를 입력하세요.(종료:0)>> ");
			if (data.equals("0")) {
				System.out.println("시스템을 종료합니다.");
//				System.out.println("-------최종 결과-------");
//				System.out.println("60점 미만 : " + f + "명");
//				System.out.println("60점 이상 : " + d + "명");
//				System.out.println("70점 이상 : " + c + "명");
//				System.out.println("80점 이상 : " + b + "명");
//				System.out.println("90점 이상 : " + a + "명");
//				System.out.println("--------------------");
//				System.out.println("총 " + count +"명의 평균은 " + sum/(double)count + "점");
//				// 산술연산 중 하나만 실수여도 무조건 실수!(double)
				
//				>> 프린트하는거  그냥 아래로 옮김. 어디에 둬도 상관 없음
				
				break; // while문의 브레이크
			}
			int data2 = Integer.parseInt(data); // 입력받은 data를 정수로 바꿔주기**
			
			if (data2 >= 90) {
				a++;
				sum = sum + data2;
				count++;
			} else if (data2 >= 80) {
				b++;
				sum = sum + data2;
				count++;
			} else if (data2 >= 70) {
				c++;
				sum = sum + data2;
				count++;
			} else if (data2 >= 60) {
				d++;
				sum = sum + data2;
				count++;
			} else {
				f++;
				sum = sum + data2;
				count++;
			}
		} // while
		
		// while문을 끝내고 프린트하기
		System.out.println("-------최종 결과-------");
		System.out.println("60점 미만 : " + f + "명");
		System.out.println("60점 이상 : " + d + "명");
		System.out.println("70점 이상 : " + c + "명");
		System.out.println("80점 이상 : " + b + "명");
		System.out.println("90점 이상 : " + a + "명");
		System.out.println("--------------------");
		System.out.println("총 " + count +"명의 평균은 " + sum/(double)count + "점");
		// 산술연산 중 하나만 실수여도 무조건 실수!(double)

		// 무한반복은 while, 횟수선택은 for (반복문)

	}

}
