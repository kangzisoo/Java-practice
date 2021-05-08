package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// 배열: 늘어놓다.
		//		array(어레이)
		int[] num = new int[1000]; //대괄호!
		System.out.println(num);
		
		int[] num2 = new int[5];
		//1. 그림을 그려보세요.
		//2. 전체 변수가 몇개? 7개
		//3. 각 변수에는 무엇이 들어있는가? 
		//	 num2: 데이터들이 들어있는 주소
		//	 int[5]: 자동초기화된 값, 0
		//	 length: *읽기전용, 배열에 들어간 저장공간의 개수
//					  배열은 크기를 변경 불가능
		//4. 첫번째를 가리킬때는 num2[0]
		//	 얼마가 들어있는가? 초기값으로 다 0
//		0 0.0 false ' '
		//5. 두번째 num2[1]위치를 나타냄 300 넣어서 프린트
		//6. num2 변수에는 뭐가 들어있는가? [I@15db9742
		num2[1] = 300;
		System.out.println(num2[1]);
		System.out.println(num2);
		System.out.println(num2.length);
		

		int[] num3 = new int[5];
		//i:index
		//배열에 데이터를 넣거나,꺼내거나,위치값을 알고 싶거나,,,
		for (int i = 0; i < num3.length; i++) {
			System.out.println(i + ": " + num3[i]);
		}
		//알아서 index0부터 시작해서 끝까지 1씩 증가하면서
		//하나씩 꺼내와라. for-each
		//배열에서 순서대로 꺼내어 특정한 처리 할때 사용 (입력X)
		for (int x : num3) { // x는 인덱스 아니고 각 자리 값
			System.out.println(x);
		}

	}

}
