package models;

import java.util.Random;

public class Enemy extends Character{

	private String[] names = {"Bob", "Randy", "Red Beard", "Black Beard", "Blue Beard", "One Beard", "Two Beard", "Jack", "Barbossa", "Jones", "Long Larry", "Foggy Freddy", "Thirsty Theo", "Salty Sam", "Bard Barry", "Davy", "K'nuckles", "Flapjack", "Bubby", "Peppermint Larry"};
	
	public Enemy(int crewReference, int difficulty){
		
		Random randold = new Random();
		int nameSel = randold.nextInt(20);
		String name = names[nameSel]; 
		setCaptainName(name);
		System.out.println(getCaptainName());
		int crew = randold.nextInt(crewReference/2)+50;
		setCrewCount(crew*difficulty);
		setATK((int)(getCrewCount()*0.06));
		setDEF(getATK());
		System.out.println("Crew: "+getCrewCount());
		System.out.println("ATK: "+getATK());
		System.out.println("DEF: "+getDEF());
	}
	
	@Override
	public void takeDamage(int damage) {
		// TODO Auto-generated method stub
		
	}
}
