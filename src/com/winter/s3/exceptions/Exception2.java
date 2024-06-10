package com.winter.s3.exceptions;

public class Exception2 {
	public void hap(int n1, int n2) throws Exception {
		// 3살 - 3자리수 이상은 모른다.
		// 3자리수 이상이 오면 강제로 Exception을 발생시키도록 한다.
		int h = n1 + n2;

		if (h > 99) {
			throw new MyException("3자리수는 몰라요");
			// 예외 처리 방법 2가지 try catch, throw Exception
		}
	}
}
