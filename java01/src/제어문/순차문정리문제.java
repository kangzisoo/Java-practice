package 제어문;

import javax.swing.JOptionPane;

public class 순차문정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		String a1 = JOptionPane.showInputDialog("당신의 취미는>> ");// 골프
		String a2 = JOptionPane.showInputDialog("당신의 여행지는>> ");// 제주도
		// 처리
		String result = "당신은 " + a2 + "로 " + a1 + "를 즐기러 간다.";
		// 출력
		JOptionPane.showMessageDialog(null, "실행결과>> " + result);
	}

}
