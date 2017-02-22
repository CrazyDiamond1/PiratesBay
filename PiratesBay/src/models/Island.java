package models;

import java.util.*;

public abstract class Island {

	private HashMap<String, Loot> buyables = new HashMap<>();
	private boolean isOwned;

	//changed from "Returns Loot" to "Returns Void"
	public void itemToBuy(Player player, Loot lootItem) {

		player.setGold(player.getGold()-lootItem.getValue());
		buyables.remove(lootItem.getName());
		player.getLoot().put(lootItem.getName(), lootItem);
	}

	//changed from "Returns int" to "Returns Void"
	public void itemToSell(Player player, Loot lootItem) {

		player.setGold(player.getGold()+lootItem.getValue());
		player.getLoot().remove(lootItem.getName());
	}

	public int beingRaided(Character player) {

		return 0;
	}

	public boolean beingAttacked() {

		return false;
	}

	public void recruit() {

		
	}

}
