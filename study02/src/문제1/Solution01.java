package 문제1;

public class Solution01 {
	
	//문자열s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수 solution
    public boolean solution(String s) { //s는 길이 1이상, 8이하인 문자열
        boolean answer = true; //answer의 초기값은 true
        
        if(s.length() != 4 && s.length() != 6){
            answer = false;
            //1. 문자열s의 길이가 4와 6 둘다 아닌 경우 false를 반환하고 종료한다.
        }else{
        	//2. 문자열s의 길이가 4 혹은 6을 만족할 경우, 두번째 조건을 확인한다.
        	//	 (숫자로만 구성되어 있는지 확인)
            for(int i=0; i<s.length(); i++){
            	//문자열 s의 길이만큼 반복한다.
                if(s.charAt(i) < 48 || s.charAt(i) >= 58 ){
                	// ASCII코드 48~57 (숫자 0~9)
                	// if(s.charAt(i) < '0' || s.charAt(i) > '9' ){
                    answer = false;
                    break;
                    //3. 문자열의 각 자리가 숫자가 아니면, false를 반환하고, for문을 종료한다.
                }//if문 끝
            }//for문 끝    
        }//else문 끝

        return answer;
    }
       
}