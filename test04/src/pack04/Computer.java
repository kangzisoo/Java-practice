package pack04;

public class Computer {
	//멤버변수 생성
	public int price;
	public String color;
	public String company;
	
	//멤버메서드 생성
	public void on() {
		System.out.println("컴퓨터를 켜다.");
	}
	public void off() {
		System.out.println("컴퓨터를 끄다.");
	}
	//멤버변수를 초기화할 수 있는 파라메터 있는 생성자
	public Computer(int c1, String c2) {
		price = c1;
		color = c2;
//		company = c3; //멤버변수 그대로
	}
	//멤버변수값 출력하도록 toString()오버라이드
	@Override
	public String toString() {
		return "Computer [price=" + price + ", color=" + color + ", company=" + company + "]";
	}
	
	
	
	
}
