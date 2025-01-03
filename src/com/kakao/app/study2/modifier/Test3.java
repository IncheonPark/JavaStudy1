package com.kakao.app.study2.modifier;

public class Test3 {
	
	private static Test3 t3;
	
	private String name;
	
	
	private Test3() {
		
	}

	// 객체를 한번만 만들도록 하는 메서드 > 디자인 패턴 중 Singleton이라 부르는 것
	public static Test3 getInstance() {
		if(Test3.t3 == null) {
			Test3.t3 = new Test3();
		}
		return t3;
	}
	//--------------------------------------
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
