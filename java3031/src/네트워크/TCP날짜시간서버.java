package 네트워크;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP날짜시간서버 {

	public static void main(String[] args) throws Exception {
		int count = 0;
		//클라이언트의 요청을 승인해주기 위한 서버소켓 생성
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		while (true) { //서버가 연결되어있는 동안 계속 반복하도록 설정
			Socket socket = server.accept(); //클라이언트의 연결요청을 기다려주기 위한  accept()메서드 호출
			count++; //증감연산자로 클라이언트 연결 횟수 카운팅
			System.out.println("서버가 " + count + "개의 클라이언트의 요청을 승인함.");
			//소켓을 통해서 클라이언트로 내용을 내보냄.
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			Date date = new Date(); //날짜시간 생성
			out.print(date); //클라이언트로 보낼 내용에 날짜시간 출력
			out.close();
	        socket.close();

		}
	}

}
