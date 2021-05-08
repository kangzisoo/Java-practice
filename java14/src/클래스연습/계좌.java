package 클래스연습;

public class 계좌 {
	//계좌를 사용하기 위해 필요한 속성값.
	String name; //이름
	String acc; //계좌이름
	int money; //금액
	//자바에서 변수는 언제 만들어지나요?
	//타입 변수명; (선언)
	//선언할때 변수가 만들어진다.
	//선언의 변수를 사용할 수 있는 범위
	//클래스 아래에서 선언됨.
	//클래서 전역에서 사용 가능.
	//전역변수, 글로벌 변수
	//전역변수는 자동초기화됨.
	
	//계좌에서 사용할 동작(메서드).
	public void 입금하다(int x) {
		System.out.println(money + x + "원 입금하다.");
	}
	public void 출금하다(int x) {
		System.out.println(money - x + "원 출금하다.");
	}
}
