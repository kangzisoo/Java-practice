package yesterday;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 1. 어떤 입력을 받아서 (1-2개 정도 입력)
		// 2. 간단한 처리
		// 3. 처리 결과를 출력
		
		//입력
		String x = JOptionPane.showInputDialog("나이를 입력하세요>> ");
		String y = JOptionPane.showInputDialog("거주지를 입력하세요>> ");
		//처리
		String result = "당신은" + x + "세의 " + y + "거주자 입니다.";
		//출력
		JOptionPane.showMessageDialog(null, result);

	}

}
