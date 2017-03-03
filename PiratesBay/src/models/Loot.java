package models;

import java.util.Random;

public class Loot 
{
protected Random rand = new Random();
	
	protected String name;
	protected int value;
	
	public Loot()
	{
		this.name = namePicker();
		this.value = rand.nextInt(50) + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public void buy(Player buyer)
	{
		if(buyer.getGold() > value)
		{
			buyer.setGold(buyer.getGold() - value);
			buyer.addLoot(this);
		}
	}
	
	public void sell(Player seller)
	{
		seller.removeLoot(this);
		seller.setGold(seller.getGold() + this.value);
	}
	
	public String namePicker()
	{
		String[] names={
			"Chairs",
			"Wine",
			"Swords",
			"Copper",
			"Rum",
			"Lumber",
			"Steel",
			"Silk",
			"Paper",
			"Glass",
			"Wheat"
		};
		int i = rand.nextInt(11);
		
		return names[i];
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("Name: ");
		
		sb.append(this.getName());
		sb.append("\nValue: ");
		sb.append(this.getValue());
		sb.append("\n------------");
		
		return sb.toString();
	}
}