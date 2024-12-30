package com.kakao.app.study1.array;

public class ArrayStudy4 {

	public static void main(String[] args) {
		
		// 비교해 보기
		// 0 -> 1, 2, 3, 4
		// 1 -> 2, 3, 4
		// 2 -> 3, 4
		// 3 -> 4
		
		int [] nums = {6, 9, 7, 4, 1};
		
		
		for (int i = 0; i < nums.length-1; i++) {
			System.out.println(i);
			
			for(int j = i+1; j < 5; j++) {
				System.out.print(j);
				
				int temp = nums[i];
				if(nums[i] < nums[j]) {
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		for (int i=0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
	
}
