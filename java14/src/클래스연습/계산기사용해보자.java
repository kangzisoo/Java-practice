package 클래스연습;

public class 계산기사용해보자 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		int coffeePrice = 4600;
		int juicePrice = 5000;
		cal.add(coffeePrice, juicePrice); //입력값을 받을 수 있는 함수여야함.(저장소.!)
		cal.minus(juicePrice, coffeePrice);

	}

}
