package 클래스연습;

public class 계좌정보사용하기 {

	public static void main(String[] args) {
		계좌 아버지 = new 계좌();
		아버지.name = "홍길동";
		아버지.acc = "튼튼적금";
		아버지.money = 1000;
		
		계좌 아들 = new 계좌();
		아들.name = "박길동";
		아들.acc = "튼튼예금";
		아들.money = 2000;
		
		System.out.print("아버지 " + 아버지.name + " " + 아버지.acc + "에 ");
		아버지.입금하다(5000);
		System.out.print("아들 " + 아들.name + " " + 아들.acc + "에서 ");
		아들.출금하다(1000);
		

	}

}
