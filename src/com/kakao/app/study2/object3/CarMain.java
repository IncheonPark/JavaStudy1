package com.kakao.app.study2.object3;

public class CarMain {

	public static void main(String[] args) {
		

		Car car1 = new Car();
		car1.info();
		
		Car car2 = new Car();
		car2.info();
		
		car2.color = "White";
		car2.info();
		
		car2 = new Car("Blue");
		car2.info();
		
		car2 = new Car("그랜져", "Red");
		car2.info();
		
		
	}

}
