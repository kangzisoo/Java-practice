package 배열응용;

import javax.swing.JOptionPane;

public class 여러개숫자입력 {

	public static void main(String[] args) {
		int[] num = new int[3]; //{0,0,0}
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력"); //"100"
			//기본형과 참조형 끼리는 캐스팅 불가함, 기본형-기본형 끼리 참조형-참조형
			//String --> int: Integer
			int data2 = Integer.parseInt(data); // "100" --> 100
			//double d = Double.parseDouble(data);
			num[i] = data2;
		}
		for (int x : num) {
			System.out.print(x + " ");
		}
		int sum = 0; //변수 만들 때, 초기화 꼭 해줘야한다.
		
		for (int x : num) {
			sum = x + sum;
		   //램  <-- CPU
		}
		System.out.println(String.format("%.2f", sum / (double)num.length));

	}

}
