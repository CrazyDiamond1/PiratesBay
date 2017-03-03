package models;

import java.util.HashMap;
import java.util.Random;

public class Player extends Character
{
	private HashMap<String, Loot> loot = new HashMap<>();
	
	public Player(int selection, String name) {

		Random randold = new Random();
		setCaptainName(name);
		// 1 is easy
		if (selection == 1) 
		{
			setATK(20);
			setDEF(20);
			int crew = randold.nextInt(50) + 200;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
		} 
		else if (selection == 2) 
		{
			setATK(16);
			setDEF(16);
			int crew = randold.nextInt(50) + 100;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
		} 
		else if (selection == 3) 
		{
			setATK(12);
			setDEF(12);
			int crew = randold.nextInt(50) + 50;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
		} 
		else if (selection == 4) 
		{
			
			setATK(8);
			setDEF(8);
			int crew = randold.nextInt(50) + 10;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 10;
			setGold(gold);
			setCrewCount(crew);
		} 
		else 
		{
			setATK(20);
			setDEF(20);
			int crew = 200;
			setCrewCount(crew);
			System.out.println("Default crew size: " + crew);
			int gold = 50;
			setGold(gold);
			System.out.println(" Default gold size: " + gold);
		}

	}

	public HashMap<String, Loot> getLoot() {
		return loot;
	}

	public void setLoot(HashMap<String, Loot> loot) {
		this.loot = loot;
	}

	@Override
	public void takeDamage(int damage) {

		setCrewCount(getCrewCount() - damage);
	}

	public void addLoot(Loot lootItem) {
		loot.put(lootItem.getName(), lootItem);
	}

	public void removeLoot(Loot lootItem) {
		loot.remove(lootItem.getName());
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
		sb.append("\nGold: ");
		sb.append(this.getGold());
		
		return sb.toString();
		
	}
}