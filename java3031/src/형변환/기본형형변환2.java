package 형변환;

public class 기본형형변환2 {

	public static void main(String[] args) {
		int sum = 333;
		int count = 5;
		//평균을 내는 경우, 하나라도 double이면 결과가 double임.
		double avg = (double)sum/count; //괄호로 우선순위 결정, 계산하기 전 하나를 double로 바꿔줘야 함
		//333을 333.0, 333.0/5 => 66.6
		double avg2 = (double)(sum/count); //정수끼리 라서 값도 int로 계산됨.
		//333/6 => 66.0 <-- (double)66
	}

}
