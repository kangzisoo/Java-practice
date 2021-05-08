package 문제2;

public class 합계평균최대최솟값 {
	public static void main(String[] args) {
		int array[] = {3, 12, 45, 32, 54, 22};
		
		int sum = 0;
		double avg = array[0];
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			sum+=array[i]; //합계
			
			if(max<array[i]) //최댓값
				max=array[i];
			
			if(min>array[i]) //최솟값
				min=array[i];
		}
		avg= (double)sum / array.length; //평균
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		
	}

}
