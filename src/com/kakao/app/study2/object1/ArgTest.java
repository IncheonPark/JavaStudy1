package com.kakao.app.study2.object1;

public class ArgTest {
	
	public void info(int num) { //info 메서드 안에 선언 되었다. 즉, stack에서 info 스택의 지역 변수라는 얘기
		
		num = num*3;
		System.out.println(num);		
		
	}
	
	public void info2(Student student) {
		
		student = new Student(); //기존 student가 가리키던 100번지에서 200번지의 또 다른 객체를 가리키게 바꿈
		student.kor = 60; //200번지의 kor을 변경했기 때문에, 100번지의 kor데이터는 그대로 30이다.
		System.out.println(student.kor);
		
	}

}
