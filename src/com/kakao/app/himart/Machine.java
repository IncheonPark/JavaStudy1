package com.kakao.app.himart;

public class Machine {

	private int price;
	private int point;
	private String brand;
	
	
	
	public void info() {
		System.out.println("===============================");
		System.out.println("가격 : " + price);
		System.out.println("포인트 : " + point);
		System.out.println("브랜드 : " + brand);
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
}
