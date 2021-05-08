package 컬렉션;

import java.util.HashMap;

public class 컬렉션연습4 {

	public static void main(String[] args) {
		//휴대폰 단축키 => 맵형
		HashMap num = new HashMap();
		num.put(1, "엄마");
		num.put(2, "아빠");
		num.put(3, "친구");
		num.put(4, "동생");
		System.out.println(num.get(2));
	}

}
