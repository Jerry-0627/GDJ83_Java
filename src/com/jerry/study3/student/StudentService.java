package com.jerry.study3.student;

import java.util.Scanner;

public class StudentService {

	public Student[] makeStudent() {
		// 같은 데이터타입을 묶는것 (타입의 제한이 없음)
		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 수를 입력하세요.");
		int count = sc.nextInt();
		// 클래스는 내 마음대로 커스텀 할 수 있는 데이터 타입이다. 라고 생각하는 것이 프로그래밍 하는데 있어서 더 쉬움
		// 배열은 같은 데이터 타입을 모을 수 있다.
		// 학생들을 모을 배열을 리턴;
		// Student
		// 배열
		// student를 모을 데이터타입을 설정하자
		Student[] students = new Student[count];
		// Student는 힙 영역에 배열이 생기는데, 힙 영역에 기본값은 자동으로 생성된다. 그런데 Student는 reference 타입이기
		// 때문에
		// 기본값은 null로 지정된다.

		for (int i = 0; i < students.length; i++) {

			// students[i] = new Student();
			Student s = new Student(); // 학생 하나를 만들었다.
			System.out.println(i + 1 + " 번째 이름 입력");
			s.name = sc.next();
			System.out.println(s.name + "의 번호를 입력");
			// 객체 안에 맴버 변수의 안에 넣자..?
			s.num = sc.nextInt();
			System.out.println(s.name + "의 국어 점수를 입력");
			s.kor = sc.nextInt();
			System.out.println(s.name + "의 영어 점수를 입력");
			s.eng = sc.nextInt();
			System.out.println(s.name + "의 수학 점수를 입력");
			s.math = sc.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;
//			students[i] = s;

			// 이게 객체를 만드는 방법임
			// 오른쪽에 있는 것을 왼쪽에 넣을 때 데이터 타입이 같아야 하는데, student[i]의 데이터 타입은 Student이다.
			// 클래스 타입을 사용하라면 객체부터 만들어야 한다.
			// 이전에 만든 것과 주소가 다르다(?)
		}
		return students;
	}

}
