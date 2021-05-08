package 네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP날짜시간클라이언트500 {

	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i < 500; i++) {
			Socket socket = new Socket("localhost", 9000); //host는 네트워크로 연결된 node
			//localhost의 9000번 포트에 연결요청 후 
			System.out.println(i + "번: 클라이언트가 9000번 포트 서버에 연결을 요청함.");
			//BufferedReader클래스는 '문자'들을 줄단위로 가지고 와서 처리할 수 있는 클래스
			//Reader, Writer클래스는 문자들만 처리하는 클래스
			
//			//1. 서버에서 보낸 정보를 1byte단위로 받아옴. 아직 문자인지 인식되지 않은 data형태
//			InputStream input = socket.getInputStream();
//			//2. 서버에서 받아온 data를 2byte의 '문자'로 인식시켜줌.
//			InputStreamReader reader = new InputStreamReader(input);
//			//3. 2byte단위로 처리된 문자들을 줄단위로 읽어옴.
			//	 buffer: 임시 기억 장소
//			BufferedReader buffer = new BufferedReader(reader); 
			
			//1~3을 한 줄로. 이런 형식을 더 많이 씀.
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			//data변수에 줄단위로 기억시킨 후 출력
			String data = buffer.readLine();
			System.out.println("서버로부터 받은 날짜 및 시간 >> " + data);
			
		}
	}

}
