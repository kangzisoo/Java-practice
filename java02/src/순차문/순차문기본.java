package 순차문;

import javax.swing.JOptionPane;

public class 순차문기본 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// *입력하는 부분
		String food = JOptionPane.showInputDialog("먹고싶은 점심 메뉴는 ");
		System.out.println(food);
		
//		if (food == "짬뽕"); food는 기본데이터가 아니라서 X		
//		if (food.equals("짬뽕")) {
//			JOptionPane.showMessageDialog(null, "중국집으로");
//		} else if (food.equals("우동")) {
//			JOptionPane.showMessageDialog(null, "일식집으로");
//		} else if (food.equals("라면")) {
//			JOptionPane.showMessageDialog(null, "분식집으로");
//		} else {
//			JOptionPane.showMessageDialog(null, "편의점으로");
//		}
//		//그러나, 너무 반복이 많아서 안좋은 코드.(처리/출력을 따로해라!)
		
		// *처리하는 부분
		// if~else~문은 true이면 처리하고, 아니면 break.
		String result = "";
		if (food.equals("짬뽕")) {
			result = "중국집으로";
		} else if (food.equals("우동")) {
			result = "일식집으로";
		} else if (food.equals("라면")) {
			result = "분식집으로";
		} else {
			result = "편의점으로";
		}
		
		// *출력하는 부분
		JOptionPane.showMessageDialog(null, result);

	}

}
