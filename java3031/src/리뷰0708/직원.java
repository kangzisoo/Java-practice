package 리뷰0708;

public class 직원 {
	String name;
	int age;
	String tel;
	
	public 직원(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		
	}

	@Override 
	public String toString() { //재정의.!
		return "직원 정보 >> 이름: " + name + ", 나이: " + age + ", 전화번호: " + tel;
	}
}
