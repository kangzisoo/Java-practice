package 순차문;

import javax.swing.JOptionPane;

public class 순차문정리문제 {

	public static void main(String[] args) {
		// 문제1.
		// 구매항목: 과자/라면/커피
		// vip이면 천원 할인
		int price = 5000; // 구매금액:5000
		String item = JOptionPane.showInputDialog("무엇을 구매하셨습니까?(과자/라면/커피) ");
		if (item.equals("과자")) {
			JOptionPane.showMessageDialog(null, "과자라면 어린이군요");
		} else if (item.equals("라면")) {
			JOptionPane.showMessageDialog(null, "라면이면 성인이군요");
		} else {
			JOptionPane.showMessageDialog(null, "뭔가를 샀군요!");
		}

		String vip = JOptionPane.showInputDialog("당신은 vip입니까?(yes/no) ");
		if (vip.equals("yes")) {
			JOptionPane.showMessageDialog(null, "vip할인>> 결제하실 금액은 " + (price - 1000));
		} else {
			JOptionPane.showMessageDialog(null, "결제하실 금액은 " + price);
		}

		// 문제2.
		int score = 88;
		char grade = ' ';
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("점수가 " + score + "이면, 학점은 " + grade);

	}

}
