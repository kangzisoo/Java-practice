package 문제1;

public class Solution01실행 {

	public static void main(String[] args) {
		Solution01 s = new Solution01();
		System.out.println("길이가 4 혹은 6인 '숫자'이면 true");
		System.out.println("a234   : " + s.solution("a234"));
		System.out.println("1234   : " + s.solution("1234"));
		System.out.println("12345  : " + s.solution("12345"));
		System.out.println("123456 : " + s.solution("123456"));
	}

}
