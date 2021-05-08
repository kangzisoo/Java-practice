package 클래스사용하기;

import 클래스만들기.강아지;

public class 마당 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		//객체이름dog1, 멤버변수color, type => 변수 3개 만들어짐
		강아지 dog2 = new 강아지();
		//dog2. color, type 
		
		dog1.color = "하얀색";
		dog1.type = "말티즈";
		dog2.color = "갈색";
		dog2.type = "푸들";
		
		//패키지 밖에서는 (public으로 선언하지 않은) 멤버변수(성질) not visible
		
		dog1.잠자다();
		dog2.간식먹다();

	}

}
