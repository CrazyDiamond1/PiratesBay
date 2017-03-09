package models;

import java.util.HashMap;
import java.util.Random;

public class Island 
{
	Random rand = new Random();
	private HashMap<String, Loot> buyables = new HashMap<>();
	private boolean isOwned = false;
	private boolean raided = false;
	private String name;
	
	int i = 0;
	private String[] names = {
			"Tortuga",
			"Cuba",
			"Puerto Rico",
			"Port Royal",
			"Ravens Cove",
			"Rambleshack",
			"Isla Cruces",
			"Isla de Muerta",
			"Isla de Pelegosto",
			"Shipwreck Cove",
			"Black Pearl Island"
	};

	public Island()
	{
		raided = false;
		name = names[rand.nextInt(11)];
	}
	
//	public void buyItem(Player player) {
//
//		System.out.println("Ready to buy some things?");
//		boolean buying = true;
//
//		while (buying) {
//
//			ArrayList<Loot> availableItems = new ArrayList<>();
//			ArrayList<String> itemNames = (ArrayList<String>) buyables.keySet();
//
//			for (String name : itemNames) {
//
//				availableItems.add(buyables.get(name));
//			}
//
//			int choice = UserInput.userResponseToMenu(itemNames.size());

//			switch (choice) {
//
//			case 1:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(1)).getValue());
//				buyables.remove(buyables.get(itemNames.get(1)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(1)).getName(), buyables.get(itemNames.get(1)));
//				break;
//
//			case 2:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(2)).getValue());
//				buyables.remove(buyables.get(itemNames.get(2)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(2)).getName(), buyables.get(itemNames.get(2)));
//				break;
//
//			case 3:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(3)).getValue());
//				buyables.remove(buyables.get(itemNames.get(3)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(3)).getName(), buyables.get(itemNames.get(3)));
//				break;
//
//			case 4:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(4)).getValue());
//				buyables.remove(buyables.get(itemNames.get(4)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(4)).getName(), buyables.get(itemNames.get(4)));
//				break;
//
//			case 5:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(5)).getValue());
//				buyables.remove(buyables.get(itemNames.get(5)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(5)).getName(), buyables.get(itemNames.get(5)));
//				break;
//
//			case 6:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(6)).getValue());
//				buyables.remove(buyables.get(itemNames.get(6)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(6)).getName(), buyables.get(itemNames.get(6)));
//				break;
//
//			case 7:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(7)).getValue());
//				buyables.remove(buyables.get(itemNames.get(7)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(7)).getName(), buyables.get(itemNames.get(7)));
//				break;
//
//			case 8:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(8)).getValue());
//				buyables.remove(buyables.get(itemNames.get(8)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(8)).getName(), buyables.get(itemNames.get(8)));
//				break;
//
//			case 9:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(9)).getValue());
//				buyables.remove(buyables.get(itemNames.get(9)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(9)).getName(), buyables.get(itemNames.get(9)));
//				break;
//
//			case 10:
//
//				player.setGold(player.getGold() - buyables.get(itemNames.get(10)).getValue());
//				buyables.remove(buyables.get(itemNames.get(10)).getName());
//				player.getLoot().put(buyables.get(itemNames.get(10)).getName(), buyables.get(itemNames.get(10)));
//				break;

//			}
//			
//			System.out.println("Will you continue buying? (1.Y | 2.N)");
//			int willBuy = UserInput.userResponseToMenu(2);
//			if(willBuy != 1){
//				
//				buying = false;
//			}
//		}
//	}

//	public void sellItem(Player player) {
//
//		System.out.println("Ready to sell some things?");
//		boolean selling = true;
//
//		while (selling) {
//
//			ArrayList<Loot> availableItems = new ArrayList<>();
//			ArrayList<String> itemNames = (ArrayList<String>) player.getLoot().keySet();
//
//			for (String name : itemNames) {
//
//				availableItems.add(player.getLoot().get(name));
//			}
//
//			int choice = UserInput.userResponseToMenu(itemNames.size());
//
//			switch (choice) {
//
//			case 1:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(1)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(1)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(1)).getName(), player.getLoot().get(itemNames.get(1)));
//				break;
//
//			case 2:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(2)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(2)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(2)).getName(), player.getLoot().get(itemNames.get(2)));
//				break;
//
//			case 3:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(3)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(3)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(3)).getName(), player.getLoot().get(itemNames.get(3)));
//				break;
//
//			case 4:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(4)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(4)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(4)).getName(), player.getLoot().get(itemNames.get(4)));
//				break;
//
//			case 5:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(5)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(5)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(5)).getName(), player.getLoot().get(itemNames.get(5)));
//				break;
//
//			case 6:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(6)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(6)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(6)).getName(), player.getLoot().get(itemNames.get(6)));
//				break;
//
//			case 7:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(7)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(7)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(7)).getName(), player.getLoot().get(itemNames.get(7)));
//				break;
//
//			case 8:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(8)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(8)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(8)).getName(), player.getLoot().get(itemNames.get(8)));
//				break;
//
//			case 9:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(9)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(9)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(9)).getName(), player.getLoot().get(itemNames.get(9)));
//				break;
//
//			case 10:
//
//				player.setGold(player.getGold() + player.getLoot().get(itemNames.get(10)).getValue());
//				player.getLoot().remove(player.getLoot().get(itemNames.get(10)).getName());
//				player.getLoot().put(player.getLoot().get(itemNames.get(10)).getName(), player.getLoot().get(itemNames.get(10)));
//				break;
//
//			}
//			
//			System.out.println("Will you continue selling? (1.Y | 2.N)");
//			int willsell = UserInput.userResponseToMenu(2);
//			if(willsell != 1){
//				
//				selling = false;
//			}
//		}
//	}

	public int raid(Character player) {

		
		
		return 0;
	}

	public void attack() {
		
		setOwned(true);
	}

	public int recruit(Character player) {

		int numOfNatives = player.getCrewCount()/3;
		player.setCrewCount(player.getCrewCount()+numOfNatives);
		
		return numOfNatives;
	}

	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRaided() {
		return raided;
	}

	public void setRaided(boolean raided) {
		this.raided = raided;
	}
	
	
}
