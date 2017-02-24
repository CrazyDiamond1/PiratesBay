package models;

import java.util.Random;

public class Enemy extends Character{

	public Enemy(String name, int crew){
		
		setCaptainName(name);
		setCrewCount(crew);
	}
	
	@Override
	public void takeDamage(int damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int combatCalc() {
		Random rand = new Random();
		return rand.nextInt(100) + 1;
	}

	

}
