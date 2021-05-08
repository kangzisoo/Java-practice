package 컬렉션;

import java.util.HashMap;

public class 맵형 {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		//키=값의 쌍으로 저장하고 자하는 데이터들의 모음.
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("오렌지", "orange");
		System.out.println(dic);
		System.out.println(dic.size());
		System.out.println(dic.get("바나나"));
		dic.put(1, "one");
		System.out.println(dic);
		dic.put(2, "two");
		System.out.println(dic);
	}

}
