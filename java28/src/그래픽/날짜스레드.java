package 그래픽;

import java.util.Date;

public class 날짜스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date d = new Date();
			System.out.println("날짜: " + d);
		}
		try {
			Thread.sleep(1000);//1초 : 1000, 0.5초: 500
		} catch (InterruptedException e) {
			//인터럽트(방해,중단) : esc, ctrl_c, power-off
		} 
	}
}
