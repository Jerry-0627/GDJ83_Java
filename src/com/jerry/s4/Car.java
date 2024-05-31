package com.jerry.s4;

public class Car {

	// 메인 메서드가 슽채틱인 이유는 객체 생성 없이 생성할 수 있게 하기 위해서.

	// # 접근지정자 [그외지정자] 데이터타입 변수명;
	public static final String COMPANY = "abc";
	// # 스택 영역 : 메서드가 올라와 실행되는 영역. 스택에 선언된 변순느 지역변수
	// # 힙 영역 : 객체가 생성되는 영역,. 힙에 만들어진 변수는 인스턴스 변수
	// # 메서드 영역(스태틱 영역) :
	// # 1. 우리가 만든 코드를 여기에 쫙 올리고 메인 메서드를 찾아 스택에 올린다. 그 뒤에 프로그램이 실행된다.
	// # 2. 즉, 우리가 사용할 프로그램을 먼저 올려야 한다. 프로그램 실행 순서 : 메서드 영역 => 스택 => 힙
	// # 메소드 영역의 주소를 찾기 위해 company라는 변수를 가지고 있는 클래스명을 쓴다.
	// # ex) Car.campany=(); 객체가 이미 만들어져 있기 때문에 객체를 만들지 않고 바로 쓴다.
	// # 위와 같은 변수를 '클래스 변수' 라고 부른다. 클래스명.변수명
	// # 메서드에 있는 클래스 변수는 프로그램이 종료할 때 까지 살아 있다.
	// # 제일 짧게 사는 애는 스택 영역의 지역변수이다.
	// # 중간은 멤버 변수이다. (?)
	// # 클래스 내에 선언된 변수는 멤버변수인데 static이 붙으면서 멤버 변수가 아니게 된다.

	public final int PRICE;
	// final이 붙은 것은 대문자로 쓴다.
//	{
//		this.price = 30;
//	} 이렇게 변수를 초기화 하던가 아래처럼 한다.

	public Car() {
		this.PRICE = 100;
	}

	// 메서드 변수
	public static void info() {
		System.out.println(Car.COMPANY);
		// System.out.println(this.price);
		// # System.out.println(this.price);와 같이 this.price라고 쓰면 에러가 난다.
		// # this는 멤버변수, 힙에 저장된다.
		// # 클래스 메서드에서는 인스턴스 변수는 인스턴스 매서드는 객체가 안만들어질 수도 있기 때문에 사용할 수 없다.
		System.out.println("static mrthod");
		// this.info2();
		// # this.info2();를 입력해도 에러가 뜬다. 객체가 만들어져야 하는데 this를 쓸 수 있는데, 만들지 않았기에 불가능.
	}

	public final void info2() {
		Car.info();
		// # Car.info()는 프로그램 시작 시 만들어져 있기 때문에 사용할 수 있다.
		System.out.println(Car.COMPANY);
		// # 스태틱이 붙으면 공통의
		final int num = 30; // 변수인데 변할 수 없다. 즉 상수 값이다.
	}
	// # 애도 위와 같이 클래스명.메서드명으로 사용한다.
	// # 세 영역 중 누가 먼저 만들어지는지 확인하는 것이 중요하다.
	// # static은 프로그램 내에서 공통적으로 유지하고 싶은 것을 만들 때 사용한다.

}