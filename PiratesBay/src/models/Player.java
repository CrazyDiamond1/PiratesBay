package models;

import java.util.*;

public class Player extends Character {

	private HashMap<String, Loot> loot = new HashMap<>();

	public Player(int selection, String name) {

		Random randold = new Random();
		setCaptainName(name);
		System.out.println("Captain name: " + name);
		// 1 is easy
		if (selection == 1) {

			setATK(10);
			setDEF(10);
			int crew = randold.nextInt(50) + 200;
			setCrewCount(crew);
			// temporary?
			System.out.println("crew size: " + crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			// temporary ?
			System.out.println("gold size: " + gold);
			setCrewCount(crew);
		} else if (selection == 2) {

			setATK(8);
			setDEF(8);
			int crew = randold.nextInt(50) + 100;
			setCrewCount(crew);
			// temporary?
			System.out.println("crew size: " + crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			// temporary ?
			System.out.println("gold size: " + gold);
			setCrewCount(crew);
		} else if (selection == 3) {

			setATK(6);
			setDEF(6);
			int crew = randold.nextInt(50) + 50;
			setCrewCount(crew);
			// temporary?
			System.out.println("crew size: " + crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			// temporary ?
			System.out.println("gold size: " + gold);
			setCrewCount(crew);
		} else if (selection == 4) {
			
			setATK(4);
			setDEF(4);
			int crew = randold.nextInt(50) + 10;
			setCrewCount(crew);
			// temporary?
			System.out.println("crew size: " + crew);
			int gold = randold.nextInt(50) + 10;
			setGold(gold);
			// temporary ?
			System.out.println("gold size: " + gold);
			setCrewCount(crew);
		} else {

			setATK(10);
			setDEF(10);
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
}
