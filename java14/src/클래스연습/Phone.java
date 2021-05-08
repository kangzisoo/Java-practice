package 클래스연습;

public class Phone {
	String color;
	String type;
	int size;
	
	public void call() {
		System.out.println("전화하다.");
	}
	public void message(String x, String y, int z) {
		//x, y, z가 파라메터, 매개변수 (message라는 함수 안에서만 사용할 수 있는 지역변수)
		//매개변수는 개수, 타입, 순서가 모두 맞아야 인식한다.!
		System.out.println(x + "에게 " + z + "시에 문자보내줘 >> " + y);
		//System.out.println("문자하다.");
	}
	public void internet(String x, int y, String z) {
		System.out.println(z + " " + x + " 서핑을 " + y + "시간 동안 했다.");
		//System.out.println("인터넷하다.");
	}

}
