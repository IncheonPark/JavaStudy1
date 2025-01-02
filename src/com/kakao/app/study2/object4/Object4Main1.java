package com.kakao.app.study2.object4;

import com.kakao.app.study2.object3.Car;
import com.kakao.app.study2.object3.*;


public class Object4Main1 {

	public static void main(String[] args) {
				
		Car car = new Car();
		car.info();
		
		ModTest modTest = new ModTest();
		modTest.num1 = 1;
		modTest.num2 = 2;
		modTest.num3 = 3;
		//modTest.num4 = 5;
		
		Member m = new Member(); // 값 들어가는 순서, 1. 초기화 + (초기화 블럭 {}, 잘 안씀) > 2. 생성자 > 3. 세터 (가장 많이 씀)
		m.setAge(40);
		
		System.out.println(m.getAge());
		
		
	}
	
	
}
