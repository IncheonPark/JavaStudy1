package com.kakao.app.controls;

import java.util.Scanner;

import com.kakao.app.units.Character;
import com.kakao.app.weapons.Sword;

public class GameControl {
	
	private Scanner sc;
	
	//------------------------------------------------
	public GameControl() {
		this.sc = new Scanner(System.in);
	}
	
	//------------------------------------------------
	public void start() {
		
		Character character = new Character();
		System.out.println("캐릭터의 이름 입력");		
		character.setName(sc.next());
		
		character.info();
		
		Sword sword = new Sword();
		sword.info();
		
		character.setSword(sword); //캐릭터가 소드를 습득함
		
		character.getSword().info();
		
		character.getPet().info();
		
		//character = null; 해버리면 pet도 같이 찾을 수 없게 됨, 하지만 sword는 컨트롤러에 선언되어 있어 찾을 수 있음.
		//내부 선언과 setter의 차이
		
	}

}
