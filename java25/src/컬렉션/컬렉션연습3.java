package 컬렉션;

import java.util.ArrayList;

public class 컬렉션연습3 {

	public static void main(String[] args) {
		//스키대회 1~4등, 2등 반칙으로 탈락 => 리스트형
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키"); //반칙으로 탈락
		list.add("김스키");
		list.add("정스키");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
	}

}
