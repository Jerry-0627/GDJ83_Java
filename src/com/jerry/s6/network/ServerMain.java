package com.jerry.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		// Network
		// ip:port => socket
		// Network 통신은 소켓끼리 1대1 통신이다.(서버와 클라이언트) (클라이언트가 여러개여도 1대1 통신임)
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		try {
			ss = new ServerSocket(8282);
			// ServerSocket은 열어주는 것.. 클라이언트와 서버가 통신하기 위해선 Socket이 필요함
			// ServerSocket은 종이컵을 만들어주는것
			// 서버를 열고 Client의 접속을 기다리는 중.
			System.out.println("서버 실행 후 클라이언트 기다리기");
			sc = ss.accept();
			System.out.println("Client와 연결이 성공 되었습니다.");
			is = sc.getInputStream(); // 소켓이 연결되면 아웃풋 인풋 스트림 하나씩 생김. 0과 1을 처리하는 애임
			ir = new InputStreamReader(is); // 0과 1을 문자로 읽어주는애
			br = new BufferedReader(ir); // 애는 빨대가 3개 꽂힌거임.

			String msg = br.readLine();

			System.out.println(msg);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
