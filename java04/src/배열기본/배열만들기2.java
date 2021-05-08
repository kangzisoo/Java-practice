package 배열기본;

public class 배열만들기2 {

	public static void main(String[] args) {
		double[] num = new double[3];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		for (double d : num) { //double 변수
			//for-each문에서 d는 num.length만큼 재사용
			System.out.println(d);
		}
		
		//문제1. 정수 5개 크기의 배열을 만들어서
//		10~50을 순서대로 넣는다.
//		첫번째값과 세번째값을 더해서 프린트
		int[] array1 = new int[5];
//		array1[0] = 10;
//		array1[1] = 20;
//		array1[2] = 30;
//		array1[3] = 40;
//		array1[4] = 50;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (i + 1)*10;
		}		
		System.out.println(array1[0] + array1[2]);
				
		//문제2. 스트링 3개 크기의 배열을 만들어서
//		자바, 스프링, jsp를 순서대로 넣는다.
//		"자바보다는 스프링"으로 출력
		String[] array2 = new String[3];
		array2[0] = "Java";
		array2[1] = "Spring";
		array2[2] = "Jsp";
		System.out.println(array2[0] + "보다는 " + array2[1]);
		
		
//		int[] num = new int[3];
//		=> int만 넣겠다. 같은 타입만 넣을 수 있다.
//		=> 고정된 크기를 갖는다. (크기변경 불가)

	}

}
