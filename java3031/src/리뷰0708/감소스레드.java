package 리뷰0708;

public class 감소스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			System.out.println("countdown: " + i);
			try {
				Thread.sleep(100);//0.1초
			} catch (InterruptedException e) {
				//인터럽트(방해,중단) : esc, ctrl_c, power-off
			} 
		}
	}

}
