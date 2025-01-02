package com.kakao.app.study2.object3;

public class Object3Main1 {

	public static void main(String[] args) {
		
		ObjectStudent student;
		student = new ObjectStudent();
		student.name = "Winter";
		
		student.info();
		System.out.println(student); //ObjectStudent의 주소랑 this 주소랑 값이 똑같다.
		
		
		ObjectStudent student2 = new ObjectStudent();
		student2.name = "IU";
		student2.info();
		
		
		
	}

}
