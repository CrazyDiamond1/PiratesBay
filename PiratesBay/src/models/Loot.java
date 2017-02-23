package models;

import java.util.Random;

public class Loot 
{
	protected Random rand = new Random();
	
	protected String name;
	protected int value;
	
	public Loot()
	{
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
}
