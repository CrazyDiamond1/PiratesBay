package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Player extends Character {
	private ArrayList<Loot> loot = new ArrayList<>();
	private Equipment gear = new Equipment(0, 0, "Nothing", 0);
	private Ship ship = new Ship(0, 0, "Dingy", 0);
	private int maxCrew;

	public Player(int selection, String name) {

		Random randold = new Random();
		setCaptainName(name);
		// 1 is easy
		if (selection == 1) {
			setATK(20, 0);
			setDEF(20, 0);
			int crew = randold.nextInt(50) + 200;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
			setMaxCrew(300);
		} else if (selection == 2) {
			setATK(16, 0);
			setDEF(16, 0);
			int crew = randold.nextInt(50) + 100;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
			setMaxCrew(100);
		} else if (selection == 3) {
			setATK(12, 0);
			setDEF(12, 0);
			int crew = randold.nextInt(50) + 50;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 50;
			setGold(gold);
			setCrewCount(crew);
			setMaxCrew(100);
		} else if (selection == 4) {

			setATK(8, 0);
			setDEF(8, 0);
			int crew = randold.nextInt(50) + 10;
			setCrewCount(crew);
			int gold = randold.nextInt(50) + 10;
			setGold(gold);
			setCrewCount(crew);
			setMaxCrew(100);
		} else {
			setATK(20, 0);
			setDEF(20, 0);
			int crew = 200;
			setCrewCount(crew);
			// System.out.println("Default crew size: " + crew);
			int gold = 50;
			setGold(gold);
			// System.out.println(" Default gold size: " + gold);
		}
	}

	public void sellLoot()
	{
		for(Loot l : loot)
		{
			setGold(getGold() + l.value);
			loot.remove(l);
		}
	}

	public void buyLoot(Island i, int whatToBuy) {

		String[] lootNames = new String[12];
		i.getBuyables().keySet().toArray(lootNames);

		if (i.getBuyables().get(lootNames[whatToBuy]) instanceof Ship) {

			setShip((Ship) i.getBuyables().get(lootNames[12]));
			setGold(getGold() - (i.getBuyables().get(lootNames[12]).getValue() - getShip().getValue()));
			i.getBuyables().remove(i.getBuyables().get(lootNames[12]));
		} else if (i.getBuyables().get(lootNames[whatToBuy]) instanceof Equipment) {

			setGear((Equipment) i.getBuyables().get(lootNames[12]));
			setGold(getGold() - (i.getBuyables().get(lootNames[12]).getValue() - getGear().getValue()));
			i.getBuyables().remove(i.getBuyables().get(lootNames[11]));
		} else {

			getLoot().add(i.getBuyables().get(lootNames[whatToBuy]));
			setGold(getGold() - i.getBuyables().get(lootNames[whatToBuy]).getValue());
			i.getBuyables().remove(whatToBuy);
		}
	}

	public ArrayList<Loot> getLoot() {
		return loot;
	}

	public String printLoot() {
		for (Loot l : loot) {
			System.out.println(l.toString());
		}
		return "";
	}

	@Override
	public void takeDamage(int damage) {

		setCrewCount(getCrewCount() - damage);
	}

	public void addLoot(Loot lootItem) {
		loot.add(lootItem);
	}

	public void removeLoot(int index) {
		loot.remove(index);
	}

	public Equipment getGear() {
		return gear;
	}

	public void setGear(Equipment gear) {
		this.gear = gear;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public void setLoot(ArrayList<Loot> loot) {
		this.loot = loot;
	}
	
	public int getMaxCrew() {
		return maxCrew;
	}

	public void setMaxCrew(int maxCrew) {
		this.maxCrew = maxCrew;
	}

	@Override
	public String toString() {
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