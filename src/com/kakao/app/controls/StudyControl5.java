package com.kakao.app.controls;

import java.util.Random;

public class StudyControl5 {

	public static void main(String[] args) {
		
				
		Random random = new Random();
		
		int salt = 
				random.nextInt(8)+1; // 0~8 미만의 정수 하나를 뽑은 후 +1
		System.out.println("소금은 "+salt);
		
		int ch = random.nextInt(26)+97; //97부터 ~ 122까지
		
		char word = (char)ch;
		System.out.println("문자는 "+word);
		
		int sum = word+salt;
		
		char result = ' ';
		
		//--------------------------------------
		if (sum > 122) {
			sum = sum - 26;
			result = (char)(sum);
		} else {
			result = (char)(sum);
		}
		
		System.out.println("변경 후 문자는 : " + result);
		//abcd efg - hijk lmn - opqr stu - vw xyz (총 26개, a는 97, z는 122)
		
	}
	
}

