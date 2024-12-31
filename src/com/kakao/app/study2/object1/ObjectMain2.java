package com.kakao.app.study2.object1;

public class ObjectMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		//멤버 변수 사용
		//참조변수명.멤버변수명
		
		
		
		//멤버메서드 사용
		//참조변수명.멤버메서드명([인자값, 없으면 안 넣고 있으면 넣는다. 넣어주는 타입이 일치해야한다.]);
		//인자 갯수에 제한은 없다.
		
		int n = 5;
		st.info(10, 10);
		st.info(n, 10);
		st.print();
		st.print();
		
		Student st2 = new Student();
		st2.info(n*3, 10);
		st2.print();
		
		Student [] students = new Student[5];
		for (int i = 0; i < 5; i++) {
			students[i] = st; 
			// 한명의 객체주소가 다른 배열칸에 각각 들어간다. 즉 학생은 한명이란 얘기, 착각하지 않도록 조심하자
			
		}
		
		// StudentView 사용해보기 -------------------------------------------
		Student st3 = new Student();
		st3.name = "IU";
		st3.num = 10;
		
		StudentView studentView = new StudentView();
		studentView.view(st3);
		
		// -------------------------------------------
		Student st4 = new Student();
		st4.name = "제제";
		st4.num = 100;
		
		studentView.view(st4); 
		
	}

}
