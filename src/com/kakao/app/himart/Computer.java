package com.kakao.app.himart;

public class Computer extends Machine{
	
	
	private String cpu;

	public  Computer() {
		//super();
		this.setPrice(10000);
		this.setPoint(1000);
		this.setBrand("삼성");
		this.cpu = "I7 시리즈";
	}
	
	
	public void info() {
		super.info();
		System.out.println("cpu : " + cpu);
		
	}
	
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	

}
