package com.jerry.study1;

public class Study3 {

	public static void main(String [] args) {
		//연산자: + - * / %
		// + 연산자는 산술 연산자와 연결 연산자의 의미가 있다. 특히 문자열 + primitive 타입이 만나면 역시 문자열이 된다.
		//sysout 치고 ctrl + space 누르면 자동 완성된다.
		System.out.println("1" + 1);
		System.out.println(1 + "1" + 1);
		System.out.println(1+'a'+"1");
		//a가 int 타입으로 자동 형변환 되어 1a1이 나오지 않는다.
		
		
		//물건을 고르고, 물걵의 총합계, 돈을 내고
		int total = 15760;
		int don = 60000;
		//잔돈 계산
		int jandon = don - total;
		
		//만원 갯수를 담을 변수
		int man = 0;
		int chun = 0;
		int bac = 0;
		int sip = 0;
		int il = 0;
		
		man = jandon/10000; //정수 나누기 정수이기 때문에 1이 된다.
		chun = (jandon-10000*man)/1000;
		bac = (jandon-10000*man-1000*chun)/100;
		sip = (jandon-10000*man-1000*chun-100*bac)/10;
		il = (jandon-10000*man-1000*chun-100*bac-10*sip)/10;
		
		System.out.println("잔돈 : " + jandon);
		System.out.println("만원 : " + man + "장");
		System.out.println("천원 : " + chun + "장");
		System.out.println("백원 : " + bac + "개");
		System.out.println("십원 : " + sip + "개");
		System.out.println("일원 : " + il + "개");

		
	}
	
}
