package 클래스만들기;

public class 거실 {

	public static void main(String[] args) {
		//int  x  =  100;
		//타입  변수명  =  값;
		//클래스명은 변수의 타입으로 사용할 수 있다.***
		//클래스명  변수명(객체의 이름)  =  new  클래스명();
		TV tv1 = new TV(); //tv1을 위한 color와 size가 복사(new)됨.
		TV tv2 = new TV();
		
		tv1.color = "빨간색";
		tv1.size = 50;
		
		tv2.color = "검정색";
		tv2.size = 42;
		
		tv1.on();
		tv1.off();
		
		tv2.on();
		tv2.ch();
		

	}

}
