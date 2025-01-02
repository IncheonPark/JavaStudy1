package com.kakao.app.study2.object3;

public class ObjectExMain {

	public static void main(String[] args) {

		ObjectEx ex1 = new ObjectEx();
		ex1.num1 = 10;
		ex1.num2 = 20;
		
		//----------------------------------
		ObjectEx ex2 = new ObjectEx();
		ex2.num1 = 10;
		ex2.num2 = 20;
		
		System.out.println(ex1 == ex2);
		
		ex1.eq(ex1, ex2);
		
		ex1.eq2(ex2);
		
		
		
		
	}

}
