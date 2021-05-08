package 클래스만들기; //package는 코드 맨 위에 - import - class

public class TV { 
	// 멤버변수: 내가 선택한 변수 (->선언의 위치가 중요함.)
	// 선언: ram에 변수가 생성되는 것.
	//		선언의 위치가 변수를 사용할 수 있는 범위를 결정함.
	// 전역변수(글로벌변수): 이 클래스 전체에서 사용 가능 / <-> 지역변수
	// 참조형 변수 <-> 기본형 변수
	public int ch; // public(접근제어자)이 있어야 다른 패키지에서도 사용 가능.
	public int vol;
	public boolean onOff;
	// 멤버메서드
	public void on() { //void:반환값이 없다.
		System.out.println("TV를 켜다.");
	}
	public void off() {
		System.out.println("TV를 끄다.");
	}
	public void changeCh() {
		System.out.println("채널을 바꾸다.");
	}
	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	/* Source - generate toString()...으로 자동 생성 가능.
	 * // 기존에 있던 메서드를 덮어쓰고 싶으면, 기존에 있던 메서드를 똑같이 써준다. // 오버라이딩(재정의), override public
	 * String toString() { return "채널은 " + ch + ", 볼륨은 " + vol + ", 켜져있는지 유무는 " +
	 * onOff; }
	 */
	
	

}
