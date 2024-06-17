package com.jerry.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
	public static void main(String[] args) {
		// Network
		// ip:port => socket
		// Network 통신은 소켓끼리 1대1 통신이다.(서버와 클라이언트) (클라이언트가 여러개여도 1대1 통신임)

		// @ 소캣을 만들기 전에 선언해야 하는 클래스
		ServerSocket ss = null;
		// @ 소캣은 서버와 클라이언트에서 하나씩만 만들면됨.
		Socket sc = null;

		// @ 데이터를 받는 클래스 선언
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		// @ 데이터를 보내는 클래스 선언
		OutputStream os = null;
		OutputStreamWriter ow = null;
		String str = null;
		Scanner scan = new Scanner(System.in);

		while (true)
			try {
				ss = new ServerSocket(8282);
				// ServerSocket은 열어주는 것.. 클라이언트와 서버가 통신하기 위해선 Socket이 필요함
				// ServerSocket은 종이컵을 만들어주는것
				// 서버를 열고 Client의 접속을 기다리는 중.
				System.out.println("서버 실행 후 클라이언트 기다리기");
				sc = ss.accept();
				System.out.println("Client와 연결이 성공 되었습니다.");

				while (true) {
					// @ 데이터를 받는 변수 선언
					is = sc.getInputStream(); // 소켓이 연결되면 아웃풋 인풋 스트림 하나씩 생김. 0과 1을 처리하는 애임
					ir = new InputStreamReader(is); // 0과 1을 문자로 읽어주는애
					br = new BufferedReader(ir); // 애는 빨대가 3개 꽂힌거임.
					String msg = br.readLine();
					System.out.println(msg);
					if (msg.toUpperCase().equals("exit")) {
						System.out.println("채팅을 종료합니다.");
						break;

					}
//					File file = new File("c:\\study", "Client.txt");
//					FileReader freader = new FileReader(file);
//					BufferedReader breader = new BufferedReader(freader);
//					String str1 = breader.readLine();
//					if (msg.equals("1")) {
//						ow.write(str1);
//						ow.flush();
//					}

					// @ 데이터를 보낼 변수 선언
					System.out.println("클라이언트로 보낼 메세지를 입력하세요.");
					str = scan.next();
					os = sc.getOutputStream();
					ow = new OutputStreamWriter(os);
					ow.write(str + "\r\n");
					ow.flush();
					if (str.toUpperCase().equals("exit")) {
						System.out.println("채팅을 종료합니다.");
						break;
					}

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					ow.close();
					os.close();
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
