package com.kakao.app.study2.object2;

public class SchoolMateView {

	//view 메서드
	//SchoolMate의 정보를 출력하는 메서드
	
	public void view (SchoolMate mate) {
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.print(mate.name+"\t");
		System.out.print(mate.num+"\t");
		System.out.print(mate.kor+"\t");
		System.out.print(mate.eng+"\t");
		System.out.print(mate.math+"\t");
		System.out.print(mate.total+"\t");
		System.out.println(mate.avg);
		System.out.println("-----------------------------------------");
		
	}
	
	public void viewAll (SchoolMate[] mates) {
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		
		for (int i = 0; i < mates.length; i++) {
			
			SchoolMate mate = mates[i];
			System.out.print(mate.name+"\t");
			System.out.print(mate.num+"\t");
			System.out.print(mate.kor+"\t");
			System.out.print(mate.eng+"\t");
			System.out.print(mate.math+"\t");
			System.out.print(mate.total+"\t");
			System.out.println(mate.avg);
			System.out.println("---------------------------------------------------");
			
		}
		
	}
	
}
