package 리뷰0708;

public class 증가스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("count: " + i);
			try {
				Thread.sleep(500);//0.5초
			} catch (InterruptedException e) {
				//인터럽트(방해,중단) : esc, ctrl_c, power-off
			} 
		}
	}

}
