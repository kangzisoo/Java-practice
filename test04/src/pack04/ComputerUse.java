package pack04;

public class ComputerUse {

	public static void main(String[] args) {
		//멤버변수값 초기화하면서 Computer 객체 2개 생성
		Computer com1 = new Computer(300000, "white");
		com1.company = "LG";
		Computer com2 = new Computer(500000, "silver");
		com2.company = "APPLE";
		//각 객체의 멤버변수값 출력
		System.out.println(com1.toString());
		System.out.println(com2.toString());
		//메서드 호출
		com1.on();
		com2.off();
	}

}
