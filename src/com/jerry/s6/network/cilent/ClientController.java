package com.jerry.s6.network.cilent;

import java.util.Scanner;

public class ClientController {
	// 여기 안에서만 쓸거니까 애를 멤버변수로 쓰자

	private ClientConnect clientConnect;
	private ClientService clientService;

	public ClientController() {
		clientConnect = new ClientConnect();
	}

	public void start() throws Exception {
		// 접속을 하고

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		clientConnect.getConnection();

		while (flag) {
			System.out.println("1.전체 2.상세 3.종료");
			int select = sc.nextInt();

			if (select == 1) {
				clientConnect.getOw().write("select" + "\r\n");
				clientConnect.getOw().flush();

				String info = clientConnect.getBr().readLine();
				clientService.getInfo(info);

			} else if (select == 2) {

			} else if (select == 3) {

			}

		}
	}
}
