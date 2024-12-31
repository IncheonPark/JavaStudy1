package com.kakao.app.study2.object2;

public class SchoolMateView {

	//view 메서드
	//SchoolMate의 정보를 출력하는 메서드
	
	public void view (SchoolMate mate) {
		
//		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
//		System.out.print(mates.name+"\t");
//		System.out.print(mates.num+"\t");
//		System.out.print(mates.kor+"\t");
//		System.out.print(mates.eng+"\t");
//		System.out.print(mates.math+"\t");
//		System.out.print(mates.total+"\t");
//		System.out.println(mates.avg);
//		System.out.println("-----------------------------------------");
		
	}
	
	public void viewAll (SchoolMate[] mates) {
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		
		for (int i = 0; i < mates.length; i++) {
			
			System.out.print(mates[i].name+"\t");
			System.out.print(mates[i].num+"\t");
			System.out.print(mates[i].kor+"\t");
			System.out.print(mates[i].eng+"\t");
			System.out.print(mates[i].math+"\t");
			System.out.print(mates[i].total+"\t");
			System.out.println(mates[i].avg);
			System.out.println("---------------------------------------------------");
			
		}
		
	}
	
}
