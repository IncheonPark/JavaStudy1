package com.kakao.app.study1.array;

public class ArrayStudy7 {

	public static void main(String[] args) {
		
		// 배열
		// 같은 데이터 타입을 모음 (타입에는 제한이 없다.)
		// 모을 갯수를 미리 선언, 길이 수정 X
		// 모으려고하는 데이터 타입 [] 변수명
		
		int [] ar1 = {1, 2};
		int [] ar2 = {5, 6, 7};
		
		int [] [] ars = {ar1, ar2};
				
		System.out.println(ars[0]);
		System.out.println(ars[0][0]);
		
		ars = new int[2][2]; // 
		ars[0] = ar1;
		ars[1] = ar2;
		
		ars = new int[2][];
		ars[0] = ar1;
		ars[1] = ar2;
		System.out.println(ars[0][1]);
		System.out.println(ars[1][2]);
		
		//------------------------------------
		// 가변 배열
		ars = new int [2][];
		ars[0] = new int [3];
		ars[1] = new int [2];
		
		
	}
	
}
