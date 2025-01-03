package com.kakao.app.himart;

public class HimartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Washer washer = new Washer();			
		washer.info();
		
		Tv tv = new Tv();
		tv.info();
		
		Computer computer = new Computer();
		computer.info();
		
		Customer customer = new Customer();
		customer.info();
				
//		customer.buy(tv);
//		customer.buy(washer);
//		customer.buy(computer);
		
		// 여러개 구매 메서드용 Machine 배열
		Machine[] machines = new Machine [3];
		machines[0] = tv;
		machines[1] = washer;
		machines[2] = computer;
		
		customer.buy(machines);
		
		
	}

}
