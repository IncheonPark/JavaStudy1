package com.kakao.app.zoo;

public class ZooMain {

	public static void main(String[] args) {
		
		Eagle e = new Eagle();
		AirPlane a = new AirPlane();
		
		Flyable f = a;
		
		Animal animal = e;
		Birds b = e;
		Flyable f2 = e;		
		
		// 타입 검사하는 if문 : instanceof 연산자
		if (f instanceof Eagle) {
			e = (Eagle)f;
		} else {
			a = (AirPlane)f;
		}
		
	}

}
