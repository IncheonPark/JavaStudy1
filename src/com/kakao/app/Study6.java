package com.kakao.app;

import java.util.Scanner;

public class Study6 {
	
	public static void main(String[] args) {
		
		//double n1 = 12.123%3;
		//System.out.println(n1);
		
		//편의점에서 자동 계산하는 어플 만들어보기
		//ex)
		//물건의 총 합계금액 입력 25300
		//지불한 돈이 50000
		//거스름돈 24700
		//만원 2장, 천원 4장, 백원 7개
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건 a의 가격을 입력하세요");
		int good1 = sc.nextInt();
		
		System.out.println("물건 b의 가격을 입력하세요");
		int good2 = sc.nextInt();
		
		System.out.println("물건 c의 가격을 입력하세요");
		int good3 = sc.nextInt();
		
		
		int sum = good1+good2+good3;
		
		System.out.println("지불할 금액을 입력하세요");
		int don = sc.nextInt();
		
		int jandon = don - sum;
		
		//--------------------------------------------------
		System.out.println("남은 잔돈 액수 : " + jandon +"원");
		
		int man = jandon / 10000;
		jandon = jandon % 10000;
		System.out.println("만원 " + man +"개 지급 완료, 남은 잔돈 :"+jandon+"원");
		
		int cheon = jandon / 1000;
		jandon = jandon % 1000;
		System.out.println("천원 " + cheon +"개 지급 완료, 남은 잔돈 :"+jandon+"원");
		
		int bak = jandon / 100;
		jandon = jandon % 100;
		System.out.println("백원 " + bak +"개 지급 완료, 남은 잔돈 :"+jandon+"원");
		
		int ship = jandon / 10;
		jandon = jandon % 10;
		System.out.println("십원 " + ship +"개 지급 완료, 남은 잔돈 :"+jandon+"원");
		
		
	}

}
