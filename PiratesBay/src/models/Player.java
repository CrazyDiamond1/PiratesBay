package models;

import java.util.HashMap;
import java.util.Random;

public class Player extends Character
{
	private HashMap<String, Loot> loot = new HashMap<>();
	private Equipment gear = new Equipment(0, 0, "Nothing", 0);
	private Ship ship = new Ship(0, 0, "Dingy", 0);
	
	public Player(int selection, String name) {

		Random randold = new Random();
		setCaptainName(name);
		// 1 is easy
		if (selection == 1) 
		{
			setATK(20, 0);
			setDEF(20, 0);
			int crew = randold.nextInt(50) + 200;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
		} 
		else if (selection == 2) 
		{
			setATK(16, 0);
			setDEF(16, 0);
			int crew = randold.nextInt(50) + 100;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
		} 
		else if (selection == 3) 
		{
			setATK(12, 0);
			setDEF(12, 0);
			int crew = randold.nextInt(50) + 50;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
		} 
		else if (selection == 4) 
		{
			
			setATK(8, 0);
			setDEF(8, 0);
			int crew = randold.nextInt(50) + 10;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 10;
			setGold(gold);
			setCrewCount(crew);
		} 
		else 
		{
			setATK(20, 0);
			setDEF(20, 0);
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
		sb.append("\nShip: ");
		sb.append(this.ship.name);
		sb.append("\nGear: ");
		sb.append(this.gear.name);
		
		return sb.toString();
		
	}
}