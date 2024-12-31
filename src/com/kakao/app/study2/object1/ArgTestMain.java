package com.kakao.app.study2.object1;

public class ArgTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgTest test = new ArgTest();
		
		int num = 5;
		
		test.info(num); //info에 들어간 num은 15가 되어 출력된다. stack에서 info안에 선언되고 계산된다.
		//메서드가 호출된 후 메서드 영역에 있던 것은 날아가고 호출 시점으로 되돌아간다.
		
		System.out.println(num); //하지만 main의 num은 그대로 5이다.

		//----------------------------
		Student student = new Student();
		student.kor = 30;
		test.info2(student);
		System.out.println(student.kor);
		
	}

}
