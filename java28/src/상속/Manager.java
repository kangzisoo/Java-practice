package 상속;

public class Manager extends Employee {
	private int bonus = 100; //private는 외부 접근 x
	public void test() {
		System.out.println(bonus + "만원 보너스 받으며 관리감독하다");
	}
}
