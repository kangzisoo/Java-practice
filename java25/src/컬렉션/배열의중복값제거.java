package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 배열의중복값제거 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[1000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); //0~999	
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " : " + num[i]);
		}
		
		//위의 배열에서 중복된 값을 빼고 배열을 다시 만들어라.!
		HashSet set = new HashSet();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println(set);
		System.out.println(set.size());
	}

}
