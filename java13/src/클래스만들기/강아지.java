package 클래스만들기;

public class 강아지 {
	//멤버변수 => 성질
	//객체 생성할 때 마다, 멤버 변수는 복사된다.
	public String color; //패키지 밖에서 사용하기 위해서 퍼블릭.
	public String type;
	
	//멤버메서드 => 동작 : 복사 안됨
	public void 산책하다() {
		System.out.println("산책가자. 멍멍.!");
	}
	public void 간식먹다() {
		System.out.println("간식줘. 멍멍.!");
	}
	public void 잠자다() {
		System.out.println("졸려. 쿨쿨zz.");
	}

}
