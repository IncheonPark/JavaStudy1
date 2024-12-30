package com.kakao.app.study1.array;

import java.util.Random;

public class ArrayStudy5 {

	public static void main(String[] args) {
		
		// 로또 번호 6개 뽑기 (1~45)
		Random random = new Random();		
		int [] nums = new int[6];
		
//		for (int i=0; i < nums.length; i++) {
//			nums[i] = random.nextInt(45)+1; // 1부터 45까지 대입
//			System.out.println(nums[i]);
//		}
		
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = random.nextInt(45)+1;
			
			for (int j = 0; j < i; j++) {
				
				if (nums[i] == nums[j]) { //j : 이전에 들어간 번호들
					
					i--; break;
					
				}
				
			}
			
		}
		
		for (int i=0; i < nums.length; i++) {			
			System.out.println(nums[i]);
		}
		
		
	}
	
}
