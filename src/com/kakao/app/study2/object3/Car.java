package com.kakao.app.study2.object3;

public class Car {
	
	String company;
	String brand;
	String color;
	int wheel;
	
	public Car () {
//		this.company = "Kia";
//		this.brand = "K5";
//		this.color = "Black";
//		this.wheel = 4;
				
		// this(); 자기 클래스의 또 다른 생성자 호출
		// 위에 다른 코드가 있으면 error발생
		this("Black");
		
	}
	
	public Car (String color) {
		this.company = "Kia";
		this.brand = "K5";
		this.color = color;
		this.wheel = 4;
	}
	
	public Car (String brand, String color) {
		this.company = "Kia";
		this.brand = brand;
		this.color = color;
		this.wheel = 4;
	}
	
	public Car (String brand, String color, int wheel) {
		this.company = "Kia";
		this.brand = brand;
		this.color = color;
		this.wheel = wheel;
	}
	
	public void info() {
		System.out.println("Car의 info 메서드 실행 ");
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.wheel);
		System.out.println("====================================");
	}

}
