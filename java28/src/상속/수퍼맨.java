package 상속;

public class 수퍼맨 extends 맨{
	//멤버변수 3, 멤버메서드2개를 가지고 태어남
	
	boolean fly;
	
	public void 우주를날다() {
		System.out.println("이름이" + name + "이 수퍼맨이 지구밖인 우주를 날다.");
	}

	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	
}
