package models;

import java.util.Random;

public class Enemy extends Character
{
	private String[] names = { "Bob", "Randy", "Red Beard", "Black Beard", "Blue Beard", "One Beard", "Two Beard",
			"Jack", "Barbossa", "Jones", "Long Larry", "Foggy Freddy", "Thirsty Theo", "Salty Sam", "Bard Barry",
			"Davy", "K'nuckles", "Flapjack", "Bubby", "Peppermint Larry" };

	public Enemy(int crewReference, int difficulty){
		
		Random randold = new Random();
		int nameSel = randold.nextInt(20);
		String name = names[nameSel]; 
		setCaptainName(name);
		this.setGold(randold.nextInt(100) + 1);
//		System.out.println(getCaptainName());
		int crew = randold.nextInt(crewReference/2)+50;
		setCrewCount(crew*difficulty);
		if(difficulty == 1){
			
			int atkVal = randold.nextInt(5)+6;
			setATK(atkVal, 0);
		} else if(difficulty == 2){
			
			int atkVal = randold.nextInt(5)+11;
			setATK(atkVal, 0);
		} else if(difficulty == 3){
			
			int atkVal = randold.nextInt(5)+16;
			setATK(atkVal, 0);
		} else if(difficulty == 4){
			
			int atkVal = randold.nextInt(5)+26;
			setATK(atkVal, 0);
		} else{
			int atkVal = randold.nextInt(5)+6;
			setATK(2, 0);
		}
		
		setDEF(getATK(), 0);
//		System.out.println("Crew: "+getCrewCount());
//		System.out.println("ATK: "+getATK());
//		System.out.println("DEF: "+getDEF());
	}

	@Override
	public void takeDamage(int damage) {
		setCrewCount(getCrewCount() - damage);
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("Captains Name: ");
		
		sb.append(captainName);
		sb.append("\nCrew: ");
		sb.append(this.getCrewCount());
		sb.append("\nATK: ");
		sb.append(this.getATK());
		sb.append("\nDEF: ");
		sb.append(this.getDEF());
		
		return sb.toString();
	}
}
