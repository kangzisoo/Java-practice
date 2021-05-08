package 반복문;

import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class 반복문while3 { //정답맞추기 프로그램 + 랜덤

	public static void main(String[] args) {
		// 랜덤
		Random r = new Random();
		int target = r.nextInt(100); // -21억~21억
		
//		int target = 55;
		int count = 0;
		// while문 '밖'에서 변수를 선언 및 초기화 해줘야함.!

		while (true) {
			String data = JOptionPane.showInputDialog("정답을 입력하세요.>> ");
			int data2 = Integer.parseInt(data); // 입력받은 data를 정수로 바꿔주기**
			count++;
			if (data2 == target) {
				System.out.println("축하합니다. 정답입니다.");
				System.out.println(count + "번 만에 정답을 맞췄습니다.");
			break;
			} else {
				System.out.println("정답이 아닙니다.");
				//else 안에 if~else~를 넣어준다!
				if (data2 > target) {
					System.out.println("정답보다 큰값입니다.");
				} else {
					System.out.println("정답보다 작은값입니다.");
				}
			}
			}// while
			
		}
}

		
		// 무한반복은 while, 횟수선택은 for (반복문)


