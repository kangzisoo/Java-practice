package 그래픽;

public class 카운트스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			System.out.println("count: " + i);
			try {
				Thread.sleep(500);//1초 : 1000, 0.5초: 500
			} catch (InterruptedException e) {
				//인터럽트(방해,중단) : esc, ctrl_c, power-off
			} 
		}
	}

}
