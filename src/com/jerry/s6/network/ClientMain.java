package com.jerry.s6.network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("192.168.7.118", 8282);
			System.out.println("서버와 연결 성공");
			System.out.println("서버로 보낼 메세지 입력");
			String str = sc.next();
			System.out.println(str);

			// 서버와 연결하려고 하는데, 서버에 대한 정보는 다 소켓에 있음. ,,, 내보낼 준비중
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os); // 문자
			ow.write(str + "\r\n");// str을 내보내려 하느데, 버퍼에 담긴 것을 내보내려 한다.
			ow.flush(); // 버퍼가 안비워질 수도 있기 때문에 강제로 비우는 것.

			ow.close();
			os.close();
			socket.close();
			sc.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 예외가 발생하던 어니던 무조건 실행해라.
			try {
				socket.close();
				sc.close(); // 소켓이 끝난 다음에 scanner close
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
