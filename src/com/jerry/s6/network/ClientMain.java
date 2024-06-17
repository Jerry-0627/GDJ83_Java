package com.jerry.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		// @ 소캣은 한번만 만들면됨.
		Socket socket = null;

		// @ 보내는 역할을 하는 클래스 선언
		OutputStream os = null;
		OutputStreamWriter ow = null;
		Scanner sc = new Scanner(System.in);

		// @ 받는 역할을 하는 클래스 선언
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		try {
			// @ 보내는 역할을 하는 클래스의 변수 선언 후 실행
			socket = new Socket("192.168.7.118", 8282);
			System.out.println("서버와 연결 성공");
			while (true) {

				System.out.println("1. 학생 정보 리스트");
				System.out.println("2. 세부 학생 정보");
				System.out.println("3. 종료");
				String str = sc.next();
				// System.out.println(str);
				// 서버와 연결하려고 하는데, 서버에 대한 정보는 다 소켓에 있음. ,,, 내보낼 준비중
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os); // 문자
				ow.write(str + "\r\n");// str을 내보내려 하느데, 버퍼에 담긴 것을 내보내려 한다.
				ow.flush(); // 버퍼가 안비워질 수도 있기 때문에 강제로 비우는 것.
				if (str.toUpperCase().equals("3")) {
					System.out.println("채팅을 종료합니다.");
					break;
				}

				// @ 받는 역할을하는 클래스의 변수 선언 후 실행.

				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				while (true) {
					String msg = br.readLine();
					if (msg == null) {
						break;
					}
					System.out.println(msg);
				}

//				StringTokenizer stn = new StringTokenizer(msg, "-");
//				while (stn.hasMoreTokens()) {
//					for (int i = 0; i < 6; i++) {
//						System.out.print(stn.nextToken() + "\t");
//					}
//					System.out.println("");
//				}

//				System.out.println(msg);
//				if (msg.toUpperCase().equals("exit")) {
//					System.out.println("채팅을 종료합니다.");
//					break;
//				}

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 예외가 발생하던 어니던 무조건 실행해라.
			try {
				// @ 연결을 지워줘야 메모리의 사용을 줄일 수 있음.
				br.close();
				ir.close();
				is.close();
				ow.close();
				os.close();
				socket.close();
				sc.close(); // 소켓이 끝난 다음에 scanner close
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
