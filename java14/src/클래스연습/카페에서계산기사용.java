package 클래스연습;


public class 카페에서계산기사용 {

	public static void main(String[] args) {
		int coffeePrice = 4600;
		int juicePrice = 5000;
		
		int coffeeCount = 5; //커피 주문 수
		int juiceCount = 3; //주스 주문 수
		
		
		//전체 몇잔을 주문했을까요?
		계산기 cal = new 계산기();
		cal.add(coffeeCount, juiceCount);
		//커피 값은 얼마일까요?
		int coffee = cal.mul(coffeeCount, coffeePrice); //23000
		//주스 값은 얼마일까요?
		int juice = cal.mul(juiceCount, juicePrice); //15000
		
		//전체금액? *반환(return)값 필요!*
		//메서드를 사용(=>메서드 호출,call)할 때,
		//그 처리 결과값을 가져와서  (안가져오는건 void)
		//다시 사용해야 하는 경우가 있음.
		//리턴을 받아온다.! 라고 함.
//		cal.add(cal.mul(coffeeCount, coffeePrice), cal.mul(juiceCount, juicePrice)); 에러
		System.out.println("------");
		cal.add(coffee, juice); 
		//계산기에 커피값과 주스값을 입력값으로 주면서, 더해달라고 요청함.
		
		int hour = cal.getHour();
		System.out.println("현재 시각은 " + hour);
	}

}
