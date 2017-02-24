package models;

import java.util.Random;

public class Enemy extends Character{

	private String[] names = {"Bob", "Randy", "Red Beard", "Black Beard", "Blue Beard", "One Beard", "Two Beard", "Jack", "Barbossa", "Jones", "Long Larry", "Foggy Freddy", "Thirsty Theo", "Salty Sam", "Bard Barry", "Davy", "K'nuckles", "Flapjack", "Bubby", "Peppermint Larry"};
	
	public Enemy(int crewReference){
		
		Random randold = new Random();
		int nameSel = randold.nextInt(20);
		String name = names[nameSel]; 
		setCaptainName(name);
		System.out.println(getCaptainName());
		int crew = randold.nextInt(crewReference-100)+50;
		setCrewCount(crew);
		System.out.println(getCrewCount());
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
