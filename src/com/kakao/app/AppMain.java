package com.kakao.app;

import com.kakao.app.students.CollStudent;
import com.kakao.app.students.HighStudent;
import com.kakao.app.students.MiddleStudent;
import com.kakao.app.students.Student;

public class AppMain {

	public static void main(String[] args) {
		
		// 중학생은 학생이다
		// MiddleStudent타입은 Student타입이다.
		
		MiddleStudent ms = new MiddleStudent();
		HighStudent hs = new HighStudent();
		
		ms.setHistory(60);
		
		Student st = hs;
		st = ms;
		
		ms = (MiddleStudent)st;
		
		System.out.println(ms.getHistory());
		
		//-----------------------------------------
		ms = new MiddleStudent();
		hs = new HighStudent();
		
		Student[] students = new Student[2];
		students[0] = ms;
		students[1] = hs;
		
		ms = (MiddleStudent)students[0];
		hs = (HighStudent)students[1];
		
	}

}
