package models;

import java.util.*;

public class Player extends Character {

	private HashMap<String, Loot> loot = new HashMap<>();
	
	public Player(String name, int crew) {

		setCaptainName(name);
		setCrewCount(crew);
	}

	public HashMap<String, Loot> getLoot() {
		return loot;
	}
	
	public void setLoot(HashMap<String, Loot> loot) {
		this.loot = loot;
	}


	@Override
	public void takeDamage(int damage) {
		
		// TODO Auto-generated method stub

	}

	@Override
	public int combatCalc() {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void addLoot(Loot lootItem)
	{
		loot.put(lootItem.getName(), lootItem);
	}

	public void removeLoot(Loot lootItem)
	{
		loot.remove(lootItem.getName());
	}
}
