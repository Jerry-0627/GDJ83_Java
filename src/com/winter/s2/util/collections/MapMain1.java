package com.winter.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		System.out.println(map.isEmpty());
		map.put("k1", 1); // int 타입 1을 Integer에 넣었다. 오토박싱 되어 들어감
		map.put("k2", 2);
		System.out.println(map.get("k1"));
		System.out.println(map.size());
		System.out.println(map.containsKey("k1"));
		System.out.println(map.containsValue(1));
		System.out.println(map);

		// map을 set으로 바꾼다.
		// ket들을 다시 iterator로 형변환 한다.
		map.clear();

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			// it는 스트링을 모아눴기 때문에, 하나 꺼내면 스트링이 나온다.
			String k = it.next();
			// key로 맵에서 꺼내기
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}

	}
}
