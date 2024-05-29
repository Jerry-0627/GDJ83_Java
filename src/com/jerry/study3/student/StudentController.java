package com.jerry.study3.student;

import java.util.Scanner;

public class StudentController {

	StudentService StudentService = new StudentService();

	public void start() {
		Scanner input = new Scanner(System.in);

		boolean flag = true;

		StudentService service = new StudentService();
		Student[] students = null;

		while (flag) {
			System.out.println("1.학생 정보 입력 2.전체 출력 3.학생 정보 검색 4. 프로그램 종료");
			int select = input.nextInt();

			if (select == 1) {
				System.out.println("학생 정보 입력 코드 작성");
				students = service.makeStudent();

			} else if (select == 2) {
				System.out.println("학생 정보 출력 코드 작성");
				for (int i = 0; i < students.length; i++) {
					Student s = students[i];
					System.out.println(s.name);
					System.out.println(students[i].name);
				}

			} else if (select == 3) {
				System.out.println("학생 정보 검색 코드 작성");
			} else if (select == 4) {
				System.out.println("종료합니다");
			} else {
				System.out.println("올바른 번호를 입력해주세요.");
				continue;
			}
		}

	}
}
