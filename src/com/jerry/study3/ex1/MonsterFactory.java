package com.jerry.study3.ex1;

import java.util.Random;

public class MonsterFactory {

	public Monster createMonster() {
		Monster m = new Monster();
		return m; // m을 리턴하고 싶으면 public void가 아니라 public Monster이다.
	}

	public Monster[] createMonsterGroup() {
		Random random = new Random();
		int count = random.nextInt(5) + 2;

		Monster[] monsters = new Monster[count];

		for (int i = 0; i < count; i++) {
			Monster m = new Monster();
			monsters[i] = m; // 몬스터를 각각 저장하기 위해서 하는 것이다.
		}

		return monsters;
	}

}
