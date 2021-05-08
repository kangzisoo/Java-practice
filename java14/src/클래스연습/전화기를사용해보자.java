package 클래스연습;

public class 전화기를사용해보자 {

	public static void main(String[] args) {
		Phone p1 = new Phone(); //변수 4개 생성 (참조형변수p1,color,type,기본형변수size)
		p1.color = "파랑";
		p1.type = "갤럭시";
		p1.size = 11;
		Phone p2 = new Phone();
		p2.color = "화이트";
		p2.type = "아이폰";
		p2.size = 12;
		
		p1.message("철수", "굿모닝", 10); //매개변수 3개 필요
		p2.message("길동", "굿애프터눈", 14);
		p1.internet("네이버", 10, "어제");
		p2.call();
		System.out.println("전화기2 종류: " + p2.type);
		System.out.println("전화기1 크기: " + p1.size);

	}

}
