package com.kakao.app.study1.array;

public class ArrayStudy3 {

	public static void main(String[] args) {
		
		// 정수를 모을 배열 선언, 다른 방식으로 해보자.
		int [] nums = new int[2];
		
		int [] nums2 = {10, 20};
		
		int nums3 [] = new int[3];
		// 한 번 선언된 배열의 크기는 변경 불가.
		
		nums = nums3;
		System.out.println(nums[2]);		
		
		nums2 = nums;		
		System.out.println(nums2[0]);
		
		nums2[0] = 9;
		System.out.println(nums[0]); // 얕은 복사, 다수의 변수가 같은 주소를 가리키고 있을 때, 한 쪽의 값을 바꾸면 전부 바뀜
		
		nums = new int [3];
		nums[2] = 30;
		System.out.println(nums[0] + nums [1] + nums[2]);
		
		// 깊은 복사
		int [] copy = new int [nums.length+1];
		
		for (int i = 0; i < nums.length; i++) {
			copy[i] = nums[i];
		}		
		copy[2] = 30;
		
		copy[0] = 50;
		System.out.println(nums[0]);
		
		nums = copy;
		
		System.out.println(nums[0]);
		
		
		
	}
	
}
