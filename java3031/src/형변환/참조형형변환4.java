package 형변환;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 참조형형변환4 {

	public static void main(String[] args) {
		//객체 설계할 때 2대원칙
		//1.하나의 클래스 안에는 하나의 역할만을 정의해야한다. =>응집도(Cohesion) 높게!
		//2.결합시 특정한 클래스만 지정하여 설계하면 안 된다. =>결합도(Coupling) 낮게!
		
		//Q) 아래 두 코드 중 어떤 것이 더 좋은 코드인가? 이유는?
		맨 m = new 맨();
		사람 m2 = new 맨(); // A)이게 더 좋은(권장하는) 코드이다. 결합도가 낮기 때문
		//m2 수정할 때 오른쪽만 변경하면 되기 때문에, 왼쪽을 큰 범위로 두는 것이 좋음.
		m2 = new 우먼();
		m2 = new 수퍼맨();
		//결합도가 낮은 코드는 유지보수하기에 좋고, 더 좋은 성능을 가진 클래스로의 변경도 용이함.!
		//작업량을 줄일 수 있다.
		
		//하나의 이름(m2)으로 다양한 형태를 구현하여 사용하는 자바의 특징 
		//자동형변환으로 가능, 오버로딩(다형성)
		
		//ex. 이것보다
		ArrayList list2 = new ArrayList(); 
		//    이게 더 좋은 코드
		List list = new ArrayList(); 
		list = new LinkedList();
		
	}

}
