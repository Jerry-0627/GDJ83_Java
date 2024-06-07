package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		// 배열은 몇칸인지 선언하고 만들었는데, 애는 그런거 필요 없음
		String name = "winter";
		int num = 2;
		ar.add(name);
		ar.add(num); // Integer로 바뀌었다가 오브젝트로 바뀌면서 들어감.
		ar.add(3.12);// Double로 오토박싱 되서 들어감
		ar.add('a');// Char 타입으로 오토박싱..
		ar.add(false); // boolean으로 오토박싱..
		ar.add(num);

		ar.add(1, "test");// 사이에 끼워 넣으라는 얘기~

		ar.set(0, 'c');// 해당 인덱스를 수정 하여라~

		ar.remove(0);// 인덱스 번호일 때 : 0번 인덱스에 있는 것을 삭제해라
		ar.remove(2);// 인덱스가 오브젝트일 떄 : 2와 같은 애를 찾아서 삭제해라. 잘안씀

		ar.clear();// 전체 삭제

		for (int i = 0; i < ar.size(); i++) {
			// 배열은 이미 정해져 있음. 애도 배열 기반이니까 for문 돌려
			System.out.println(ar.get(i)); // ar은 클래스니까 꺼내는 메서드가 있다.
		}

		// Array 리스트는 찾는것은 빠르다 단, 중간에 무언가를 넣거나 삭제할 땐 느리다.
		// Linked 리스트는 중간에 무언가를 넣거나 삭제할 때 빠르다.
		// 대신, 마지막에 대입할 떄 주소가 붙으니 불필요한 공간을 더 잡아먹는다.
		// 순차적으로 찾아가야 하기 떄문에, 데이터 접근이 느리다.
		// 어떤것들 써야하는지는 데이터의 구조를 살펴봐야 한다. 빨리 찾아야함 Array.. 빨리 수정..Linked
		// 대부분 Array 리스트를 많이 쓴다.
		LinkedList lk = new LinkedList();
		// 순서 유지하고 값의 중복 허용함
		lk.add("ad");
	}

}
