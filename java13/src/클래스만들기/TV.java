package 클래스만들기;

public class TV {
	//클래스 이름은 대문자로 시작해야함.
	//낙타표기법을 지켜야함
	//성질(속성, porperty, attribute)
	//=>멤버변수
	//멤버변수는 선언만 해준다.!
	//멤버젼수는 자동초기화됨.
	String color; //속성을 갖고는 있지만, 틀 이기 때문에 초기값을 넣지 않는다.
				  //참조형은 null로 자동 초기화
	int size; //기본형은 0으로 자동초기화
	
	//동작(함수, 기능처리, 명령어)
	//=>멤버메서드(method, 어떤 기능을 처리하기 위한 방법)
	public void on() {
		//함수 이름은 소문자로 시작
		System.out.println("TV를 켜다");
	}
	public void off() {
		System.out.println("TV를 끄다");
		
	}
	public void ch() {
		System.out.println("TV채널을 바꾸다.");
	}
}
