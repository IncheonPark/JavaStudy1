package com.kakao.app.himart;

public class Customer {
	
	private int money = 9000000;
	private int point = 0;
	
	
	public void info() {
		System.out.println("========================");
		System.out.println("현재 금액 : " + money);
		System.out.println("현재 포인트 : " + point);
	}
	
	public void buy(Machine machine) {
		if (this.money >= machine.getPrice()) {
			
			this.money = this.money - machine.getPrice();
			this.point = this.point + machine.getPoint();
			System.out.println("단일 구매 완료, 남은 금액 : " + this.money + " / 누적 포인트 : " + this.point);
			
		} else {
			System.out.println("보유 금액이 부족합니다.");
		}
	}
	
	public void buy(Machine[] machines) {
		
		// this.buy(machines[i]); 호출로 간단하게 실행 가능
		
		int totalPrice = 0;
		int totalPoint = 0;
		
		for (int i = 0; i < machines.length; i++) {
			totalPrice = totalPrice + machines[i].getPrice();
			totalPoint = totalPoint + machines[i].getPoint();
			
			System.out.println("결제 예정 가격 : " + totalPrice);
			System.out.println("적립 예정 포인트 : " + totalPoint);
			System.out.println("======================================");
			
		}
		
		
		if (this.money >= totalPrice) {
			
			this.money = this.money - totalPrice;
			this.point = this.point + totalPoint;
			System.out.println("제품 " + machines.length + "개 구매 완료, 남은 금액 : " 
			+ this.money + " / 누적 포인트 : " + this.point);
			
		} else {
			System.out.println("보유 금액이 부족합니다.");
		}
		
		
	}
	
	
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	

}
