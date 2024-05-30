package com.jerry.study3.student;

import java.util.Scanner;

public class StudentController {

	StudentService StudentService = new StudentService();

	public void start() {
		Scanner input = new Scanner(System.in);
		StudentService service = new StudentService();// 클래스를 호출하기 위해 객체를 먼저 만드는것이다.
		StudentView studentView = new StudentView(); // 클래스를 호출하기 위해 객체를 먼저 만드는것이다.
		StudentService findByNum = new StudentService(); // 클래스를 호출하기 위해 객체를 먼저 만드는것이다.
		StudentView oneView = new StudentView();

		Student[] students = null;
		Student student = null;
		boolean flag = true;

		while (flag) {
			System.out.println("1.학생 정보 입력 2.전체 출력 3.학생 정보 검색 4. 프로그램 종료");
			int select = input.nextInt();
			if (select == 1) {
				System.out.println("학생 정보 입력 코드 작성");
				students = service.makeStudent(); // 리턴이 있으니까 대입준거고.
			} else if (select == 2) {
				System.out.println("학생 정보 출력 코드 작성");
				if (students != null) {
					studentView.view(students);
				} else {
					studentView.view("학생 정보를 먼저 입력");
				}

			} else if (select == 3) {
				System.out.println("학생 정보 검색 코드 작성");
				student = findByNum.findByNum(students);
				if (student != null) {
					studentView.view(student);
				} else {
					studentView.view("검색 결과가 업습니다.");
				}

			} else if (select == 4) {
				System.out.println("종료합니다");
			} else {
				System.out.println("올바른 번호를 입력해주세요.");
				continue;
			}
		}

	}
}
