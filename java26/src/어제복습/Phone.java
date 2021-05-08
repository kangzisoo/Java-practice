package 어제복습;

public class Phone {

   String color;
   int size;
   
   public Phone(String color, int size){
      //this:해당클래스를의미
      //this.color: 해당클래스 밑에 바로선언된 color
      //this로 전역변수를 지정할 수 있다.
      //변수명이 전역/지역이 동일할때 전역변수를 지정할 목적으로 사용
      
      this.color = color;
      this.size = size;
   }
   
   public void internet() {
      System.out.println("인터넷하다.");
   }
   
   public void text() {
      System.out.println("문자하다.");
   }
   
}