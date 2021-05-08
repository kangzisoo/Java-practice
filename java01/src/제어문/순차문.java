package 제어문;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");//홍길동
					// 입력받는 대화창을 보여주는 옵션
		// 처리
		String result = name + "님 환영합니다.";
		// 출력
		JOptionPane.showMessageDialog(null, "나는 실행결과 출력하는 곳>> " + result);

	}

}
