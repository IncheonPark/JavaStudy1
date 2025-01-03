package com.kakao.app.himart;

public class Tv extends Machine {
	
	
	private int pixel;
	private int size;
	
	public  Tv() {
		//super();
		this.setPrice(50000);
		this.setPoint(5000);
		this.setBrand("삼성");
		this.pixel = 50000000;
		this.size = 300000;
	}
	
	
	public void info() {
		super.info();
		System.out.println("화질 : " + pixel);
		System.out.println("크기 : " + size);
		
	}
	
	
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	

}
