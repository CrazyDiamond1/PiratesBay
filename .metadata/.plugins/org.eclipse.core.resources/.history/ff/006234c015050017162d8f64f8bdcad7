package models;

public class Ship extends Loot 
{
	private int DEFMod;
	private int maxCrewShip;
	
	public Ship()
	{
		this.name = namePicker();
		this.value = rand.nextInt(100) + 1;
		this.DEFMod = rand.nextInt(30) + 1;
		this.maxCrewShip = rand.nextInt(700) + 100;
	}
	
	public Ship(int s, int d, String name, int value)
	{
		this.name = name;
		this.DEFMod = d;
		this.value = value;
	}
	
	@Override
	public String namePicker()
	{
		String[] names={
			"Light Sloop",
			"Sloop",
			"Heavy Sloop",
			"Light Galleon",
			"Galleon",
			"Heavy Galleon",
			"Light Friget",
			"Friget",
			"Heavy Friget"
		};
		int i = rand.nextInt(7);
		
		return names[i];
	}
}