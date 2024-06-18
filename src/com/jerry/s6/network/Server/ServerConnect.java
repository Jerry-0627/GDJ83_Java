package com.jerry.s6.network.Server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnect {
	private ServerSocket ss;
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;

	public void getConnect() throws Exception {
		ss = new ServerSocket(8282);

		socket = ss.accept();
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
