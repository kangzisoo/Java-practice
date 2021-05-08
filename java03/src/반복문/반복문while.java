package 반복문;

import java.util.Date;

import javax.swing.JOptionPane;

public class 반복문while { // 인기투표~

	public static void main(String[] args) {
		int iu = 0;
		int you = 0;
		int park = 0;
		// while문 '밖'에서 변수를 선언 및 초기화 해줘야함.!

		while (true) {
			String data = JOptionPane.showInputDialog("0)아이유, 1)유재석, 2)박명수, 3)종료");
			if (data.equals("3")) {
				System.out.println("투표를 종료합니다.");
				System.out.println("아이유 : " + iu + "표, 유재석 : " + you + "표, 박명수 : " + park + "표!");
				break;
			}
			// int data = 0; //아이유인 경우 0번 선택

			switch (data) {
			case "0":
				System.out.println("아이유 선택");
				iu++; // 증감연산자, iu = iu + 1;
				break;
			case "1":
				System.out.println("유재석 선택");
				you++;
				break;
			case "2":
				System.out.println("박명수 선택");
				park++;
				break;
			default:
				System.out.println("해당 연예인이 없습니다.");
				break;
			}
		}

		// 무한반복은 while, 횟수선택은 for (반복문)

	}

}
