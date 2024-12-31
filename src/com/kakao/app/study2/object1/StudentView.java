package com.kakao.app.study2.object1;

public class StudentView {
	
	// 학생의 정보를 출력
	// view 메서드 선언
	
	// 학생 한명의 정보를 출력
	public void view(Student student) {
		
		System.out.println(student.name);
		System.out.println(student.num);		
		
	}
	
	// 학생 여러명의 정보를 출력
	public void viewAll(Student[] students) {
		
		for (int i = 0; i < students.length; i++) {
			
			System.out.println(students[i].name);
			System.out.println(students[i].num);
			
		}
		
	}

}
