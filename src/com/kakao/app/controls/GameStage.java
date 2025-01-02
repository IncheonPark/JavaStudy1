package com.kakao.app.controls;

import java.util.Random;

import com.kakao.app.units.Character;
import com.kakao.app.units.Monster;

public class GameStage {
	
	private Random random;
	
	public GameStage() {
		random = new Random();
	}
	
	public void fight(Character character) {
		Random random = new Random();
		int count = random.nextInt(3)+1;
		Monster[] monsters = new Monster[count];
		
		for (int i =0; i < monsters.length; i++) {
			
			monsters[i] = new Monster();
			
		}
		
		this.attack(character, monsters);
		
	}
	
	private void attack(Character character, Monster[] monsters) {		
		
		for (int i =0; i < monsters.length; i++) {
			int randomPower = monsters[i].getPower();
			randomPower = random.nextInt(randomPower); // 몬스터의 대미지에 랜덤성을 부여 10일때 0~9까지
			character.setHp(character.getHp()-randomPower);
			
		}		
		
		
		if (character.getHp() <= 0) {
			System.out.println("캐릭터의 체력이 소진되어 쓰러졌습니다.");
		}
		
	}

}
