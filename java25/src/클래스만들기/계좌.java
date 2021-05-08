package 클래스만들기;

public class 계좌 {
	public String name;
	public String type;
	public int money;
	
	public void 예금하다(String name, String type, int money) {
		System.out.println("이름이  "+ name + "이고 종류가 " + type + "인 통장에 " + money + "원을 예금.");
	}
	public void 예금하다(String name, int money) {
		System.out.println("이름이 "+ name + "인 통장에 " + money + "원을 예금.");
		
	}
	public void 출금하다(int money) {
		System.out.println(money + "원을 출금.");
	}
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", type=" + type + ", money=" + money + "]";
	}
	

}
