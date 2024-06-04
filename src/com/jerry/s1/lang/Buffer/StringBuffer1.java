package com.jerry.s1.lang.Buffer;

public class StringBuffer1 {
	public static void main(String[] args) {
		// 문자열을 더하기 대신에 누적시키고 싶을 때(새로운 객체가 만들어지는 것이 아님)
		// 스트링 버퍼와 스트링 버퍼는 거의 같지만 스트링 버퍼가 스레드에 안전하다.
		StringBuffer sb = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		// winter + iu
		sb.append("winter");
		sb.append("iu");
		sb.append(10);

		// 결과값
		String result = sb.toString();
		System.out.println(sb);
		System.out.println(result);

	}
}
