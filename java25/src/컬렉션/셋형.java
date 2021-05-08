package 컬렉션;

import java.util.HashSet;

public class 셋형 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		//순서는 없지만, 중복을 허용하지 않는 데이터들의 모음.
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("휴대폰");
		bag.add("휴대폰"); //중복 허용하지 않음.
		System.out.println(bag.size());
		System.out.println(bag);
		bag.remove("휴지");
		System.out.println(bag);
	}

}
