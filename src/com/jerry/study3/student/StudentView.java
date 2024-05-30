package com.jerry.study3.student;

public class StudentView {

	public void view(String str) {
		System.out.println(str);
	}

	public void view(Student student) {
		System.out.println("학생이름 \t" + "학생번호 \t" + "국어점수 \t" + "영어점수 \t" + "수학점수 \t" + "총점수 \t" + "평균점수");
		System.out.print(student.name + "\t");
		System.out.print(student.num + "\t");
		System.out.print(student.kor + "\t");
		System.out.print(student.eng + "\t");
		System.out.print(student.math + "\t");
		System.out.print(student.total + "\t");
		System.out.println(student.avg + "\t");
	}

	public void view(Student[] students) {
		// 학생들의 모든 정보 출력
		System.out.println("학생 정보 전체 출력");
		System.out.println("학생이름 \t" + "학생번호 \t" + "국어점수 \t" + "영어점수 \t" + "수학점수 \t" + "총점수 \t" + "평균점수");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].num + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].total + "\t");
			System.out.println(students[i].avg + "\t");
		}

		// 학생들의 정보를 출력하고 싶지만 컨드롤러의 students 에 정보가 있음. 이 배열이 만들어진 영역은 heap영역인데, view라는
		// 메소드에서
		// heap 영역에 접근하기 위해선 배열의 주소를 알아야함. 따라서 여기서 이 주소를 어떻게 가져올 수 있을지 알아야함.
	}

}
