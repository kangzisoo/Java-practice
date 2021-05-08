package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호만들기 {

	public static void main(String[] args) {
		Random r = new Random(); //42를 넣으면 돌릴때 마다 똑같은 값
		//중복체크해서 넣어주는 클래스 사용 : HashSet
		HashSet lotto = new HashSet();
		while (lotto.size() < 6) {  //값이 무조건 6개가 되어야 하기때문에 for이 아니라 while문.!
			int num = r.nextInt(45) + 1 ; //1~45
			System.out.println("랜덤값: " + num);
			lotto.add(num);
		}
		System.out.println(lotto);

	}

}
