package 형변환;

public class 기본형형변환3 {

	public static void main(String[] args) {
		double sum = 333; //일반적이지 않은 코드지만, sum을 정수로 사용할 일이 없을 때. 
		//8바이트 <-- 4바이트, 큰 것으로 자동 형변환
		//333.0 <-- 333
		int count = 5;
		double avg = sum/count;
		System.out.println(avg); //66.6
	}

}
