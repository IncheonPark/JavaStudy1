package com.kakao.app.study2.object1;

public class ObjectMain {

	public static void main(String[] args) {
		
		// 객체 지향 프로그래밍 (OOP) 기초
		// 객체 생성은 변수 선언과 비슷하다.
		// 클래스는 데이터 타입이다. (레퍼런스 타입)
		
		Student st = new Student();
		st.name = "winter";
		st.num = 1;
		
		System.out.println(st.eng);
		System.out.println(st.name);
		System.out.println(st.num);
		
		Student st2 = new Student();
		st2.name = "summer";
		st2.num = 10;
		
		System.out.println(st2.eng);
		System.out.println(st2.name);
		System.out.println(st2.num);
		
		st = st2; //st 참조 주소에 st2 참조 주소 덮어씌움 > st의 변수를 수정하면 st2의 변수도 바뀐다. 주소가 같기 때문
		
		
		System.out.println(st.name);
		System.out.println(st2.name);
		
		//몬스터 객체 만들기 -------------------------------------------------------------
		Monster mob = new Monster();
		mob.name = "발록";
		mob.level = 95;
		mob.damage = 1000;
		mob.hp = 50000;
		mob.exp = 2500;
		mob.gold = 10000;
		
		System.out.println(mob.name);
		System.out.println(mob.level);
		System.out.println(mob.damage);
		System.out.println(mob.hp);
		System.out.println(mob.exp);
		System.out.println(mob.gold);
		
		
		//선생님 객체 만들기---------------------------------------------------------
		Teacher tc = new Teacher();
		tc.name = "김철수";
		tc.kind = "과학";
		
		
		System.out.println(tc.name);
		System.out.println(tc.kind);
		
		
		//학생 100명 만들기----------------------------------------------------
		Student[] students = new Student[5]; //Heap에 4byte짜리 메모리 공간 5칸 생성
		students[0] = st;
		System.out.println(students[0].name);
		
		for (int i = 0; i < students.length; i++) {
			
			students[i] = new Student();
			
		}
		
		tc.students = students; 
		//이름은 같지만 tc.students는 Heap, students는 Stack에 선언, 즉 다른 영역이어서 중복 선언이 아니다.
		
		//선생님의 첫번째 학생 이름 출력-------------------------------------------
		System.out.println(tc.students[0].name); //name에 넣은게 없을 때는, String의 디폴트 타입, null 출력
		
	}
	
}
