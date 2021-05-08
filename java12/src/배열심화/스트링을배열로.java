package 배열심화;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		String[] s2 = s.split(",");
		// 음식의 개수는 몇개일까요?
		System.out.println("음식의 개수는 " + s2.length + "개");
		
		String s3 = "     홍길동";
		System.out.println(s3.length());
		String s4 = s3.trim();
		System.out.println(s4.length());
		
		String s5 = s3.replace("     ", "");
		System.out.println(s5);

	}

}
