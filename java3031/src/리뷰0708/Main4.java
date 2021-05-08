package 리뷰0708;

public class Main4 {

	public static void main(String[] args) {
		증가스레드 count = new 증가스레드();
		감소스레드 countdown = new 감소스레드();
	    count.start();
	    countdown.start();

	}

}
