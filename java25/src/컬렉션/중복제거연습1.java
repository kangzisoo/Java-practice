package 컬렉션;

import java.util.HashSet;

public class 중복제거연습1 {

	public static void main(String[] args) {
		String[] food = {"감자", "고구마", "양파", "감자", "고구마"};
		
		//중복제거해서 프린트.
		HashSet set = new HashSet();
		for (int i = 0; i < food.length; i++) {
			set.add(food[i]);		
		}
		System.out.println(set);
		
		//개수가 몇개인지 세어보세요.
		System.out.println(set.size());
		
	}

}
