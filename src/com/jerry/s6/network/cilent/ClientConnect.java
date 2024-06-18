package com.jerry.s6.network.cilent;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientConnect {
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;

	// 1. 연결
	public void getConnection() throws Exception {
//		Socket socket = new Socket("localhost", 8282);
//
//		// Input 연결
//		InputStream is = socket.getInputStream();
//		InputStreamReader ir = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(ir);
//
//		// output
//		OutputStream os = socket.getOutputStream();
//		OutputStreamWriter ow = new OutputStreamWriter(os);

		// 리턴은 하나만 되기 떄문에 이걸 하나로 만들어야함
		// 1번 방법 : 여러개를 멤버로 받을 수 있는 클래스를 선언한다.
		// (단, 여기서 만든 클래스는 한번만 사용하기 때문에 자원에 대한 낭비 생겨 적합하지 않다.)
		// 2번 방법 : 여러개의 데이터를 다룰 수 있ㅎ는 콜렉션 배열을 선언한다.(배열, List, Set, Map)
		// (배열을 사용하려면 오브젝트 타입으로 담고 꺼낸 뒤에 다시 형변환 해야함)
		// (리스트로 마찬가지로 오브젝트 타입으로 답고 꺼낸 뒤에 다시 형변환 해야함.)
		// (Set도 바란가지)
		// (Map은 모든 타입을 받을 수 있지만 오브젝트로 받기 떄문에 형변환 해줘야함)
		// 3번 방법 : 위에 애들을 멤버 변수로 선언한다.
		socket = new Socket("localhost", 8282);
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);

	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}

	public void setOw(OutputStreamWriter ow) {
		this.ow = ow;
	}

	public void disConnect() throws Exception {
		br.close();
		ir.close();
		is.close();
		ow.close();
		os.close();
		socket.close();

	}
}
