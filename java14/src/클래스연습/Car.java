package 클래스연습;

public class Car {
//성질:색
	String color; //틀역할 이기 때문에 변수만 만들고 색은 넣지 않음.
	
//동작:달리다, 속도를높이다 (멤버메서드)
	public void run() { //run 기능을 사용했을때 실행되는 내용들 중괄호{} 안에.
		System.out.println("자동차가 달리다.");
	}
	public void up() {
		System.out.println("자동차가 속도를 높이다.");
	}

}
