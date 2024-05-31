package com.jerry.s2;

public class MidStudent extends Student {
	// extends Student 를 씀으로써 Student 클래스에 있는 내용이 눈에 보이지 않더라도 이 클래스에 있다,.
	private int history;

	public MidStudent() {
		super(10);
		// super 위에 다른 코드가 있으면 안된다. 생성자 라인 첫줄에 있어야 한다. 자식 생성자 안에는 super()가 기본으로 있다.
		// 위 super(10)은
		// 부모 생성자를 만들 떄 특벽한 일이 없으면 기본생성자로 둔다.

	}

	public void midinfo() {
		// System.out.println(this.num()); 으로 하면 오류가 나는데, Student 클래스의 num은 private이기
		// 때문이다
		// 이 경우 부모에 저장된 것을 가져오기 위해서ㅏ getter를 써야 한다.
		super.info();// 부모 객체를 찾아갈 때는 super를 쓰고
		System.out.println(this.history);// 자신의 객체를 찾아갈 때 this 를 쓴다.
		// 이 개념들은 잘 사용하지는 않을 것인데, 다른 라이브러리에 찾아갈 떄 사용한다.

	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

}
