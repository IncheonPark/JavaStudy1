package com.kakao.app.himart;

public class Washer extends Machine {
	
	
	private int volume;
	private String kind;
	
	public Washer() {
		//super();
		this.setPrice(20000);
		this.setPoint(2000);
		this.setBrand("삼성");
		this.volume = 1000;
		this.kind = "드럼 세탁기";
	}
	
	public void info() {
		super.info();
		System.out.println("용량 : " + volume);
		System.out.println("종류 : " + kind);
		
	}
	
	
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
	
	

}
