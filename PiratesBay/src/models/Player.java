package models;

import java.util.ArrayList;

public class Player extends Character {

	private ArrayList<Loot> loot = new ArrayList<>();
	
	public Player(String name, int crew) {

		setCaptainName(name);
		setCrewCount(crew);
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
		loot.add(lootItem);
	}

	public void removeLoot(Loot lootItem)
	{
		loot.remove(lootItem);
	}
}
