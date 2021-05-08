package 달력;

import java.util.Scanner;

public class Solution01 {

	 public String solution(int a, int b) {
	        String answer = "";
	        
	        //날짜 유효성 검사
		   	if (a > 12 | a <= 0) {
				answer = "존재하지 않는 날짜를 입력하셨습니다.";
				return answer;
			}else if (a == 1 | a == 3 | a == 5 | a == 7 | a == 8 | a == 10 | a == 12) {
				if (b > 31 | b <= 0 ) {
					answer = "존재하지 않는 날짜를 입력하셨습니다.";
					return answer;
				}
			}else if (a == 4 | a == 6 | a == 9 | a == 11) {
				if (b > 30 | b <= 0 ) {
					answer = "존재하지 않는 날짜를 입력하셨습니다.";
					return answer;
				}
			}else {
		   		if (b > 29 | b <= 0 ) {
		   			answer = "존재하지 않는 날짜를 입력하셨습니다.";
		   			return answer;
				}
		   	}
		   	//if~else문(날짜 유효성 검사) 끝
		   	
			//셋팅
	        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"}; //요일 (0,1,2,3,4,5,6)
	        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31}; //월 (일년 중 일수 계산)
	        String[] year = new String[366]; //2016년은 윤년이므로 366일
	        int dayofyear = 0; //계산할 날이 1년 중 몇번째 날인지 담을 변수
	        
	        //day of year 계산 (월)
	        for(int i=0; i<a-1; i++){
	        	dayofyear += month[i]; //각 월마다 지나는 일 수를 더해줌
	        }
	        //day of year 계산 (일)
	        dayofyear += b-1; //일수를 더해줌 (0부터 카운트하므로 -1), 1/1 = 0
	        
	        //요일 계산
	        for(int i=0; i<year.length; i++){
	        	year[i] = day[(i+5)%7]; // 1/1(FRI) = day[5]
	        }
	        
	        //a월 b일은 무슨요일? year[day of year]
	        answer = year[dayofyear];

	        return answer;
	        

	}
		public static void main(String[] args) {
			Solution01 day = new Solution01();
			
			//입력
	        Scanner scan = new Scanner(System.in);
			System.out.print("a b 를 입력하세요 (2016년 a월 b일)>> ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(day.solution(a, b));
			
			scan.close();
		}

}
