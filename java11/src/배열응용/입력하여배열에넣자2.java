package 배열응용;

import javax.swing.JOptionPane;

public class 입력하여배열에넣자2 { // 여행 문제

	public static void main(String[] args) {
		// 작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요(제주도,양양,속초)
		// 올해에 가고 싶은 곳 세곳을 입력받아 넣으세요(제주도,부산,울산)
		// 일치하는 항목이 있으면 어디인지 위치를 찾아주세요
		String[] s2020 = new String[3];
		String[] s2021 = new String[3];

		for (int i = 0; i < s2020.length; i++) {
			s2020[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 장소 입력");
		}
		for (int i = 0; i < s2021.length; i++) {
			s2021[i] = JOptionPane.showInputDialog("올해 가보고 싶은 장소 입력");
		}
		// 넣은 값 하나씩 꺼내서 출력
//		for (String x : s2020) {
//			System.out.print(x + " ");
//		}
//		for (String x : s2021) {
//			System.out.print(x + " ");
//		}
		for (int i = 0; i < s2021.length; i++) {
			System.out.println(s2020[i] + " " + s2021[i]);
		}

		// 일치하는 항목이 있는지 확인하고 싶음 & 카운트
		int count = 0;
		for (int i = 0; i < s2020.length; i++) {
			if (s2020[i].equals(s2021[i])) {
				count++;
				System.out.println("일치하는 장소는 " + s2020[i]);
				System.out.println("위치는 " + i);
			}
		}//for문 끝
		System.out.println("같은 장소의 개수는 " + count);

	}

}
