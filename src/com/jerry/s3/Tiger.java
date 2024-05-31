package com.jerry.s3;

public class Tiger extends Animal { // Animal에서 추상 메서드가 있어서 에러 메세지가 뜬다.
	int power;

	// 해결하기 위해선 이 클래스를 추상화 하던가 미완성 매서드를 여기서 완성 시킨다,
	// 매서드 오버로딩 : 같은 이름의 메서드를 여러개 만드는 것

	// 메서드 오버라이딩(overriding) : 상속 받은 메서드를 자신에게 맞게 재정의하는 것. 이 경우 sleep 매서드를 상속 받음.
	// 메서드의 선언부(Header)는 동일하게
	// 접근 지정자는 같은 범위나 더 넓은 범위로 수정 가능
	public void sleep() {
		System.out.println("누워자기");
	}

}
