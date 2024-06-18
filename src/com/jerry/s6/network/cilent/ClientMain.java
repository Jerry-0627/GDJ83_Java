package com.jerry.s6.network.cilent;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientConnect clientConnect = new ClientConnect();
		ClientService clientService = new ClientService();
		try {
//			cilentConnect.getConnection();
			String info = "1,uu,50,2,haha,85";
			clientService.getInfo(info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
