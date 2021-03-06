package models;

public class Ship extends Loot 
{
	private int DEFMod;
	private int maxCrew;
	
	public Ship()
	{
		this.name = namePicker();
		this.value = rand.nextInt(100) + 1;
		this.DEFMod = rand.nextInt(30) + 1;
		this.maxCrew = rand.nextInt(700) + 100;
	}
	
	public Ship(int mCrew, int dMod, String name, int value)
	{
		this.name = name;
		this.DEFMod = dMod;
		this.value = value;
		maxCrew = mCrew;
	}
	
	public int getDEFMod() {
		return DEFMod;
	}

	public void setDEFMod(int dEFMod) {
		DEFMod = dEFMod;
	}

	public int getMaxCrew() {
		return maxCrew;
	}

	public void setMaxCrew(int maxCrew) {
		this.maxCrew = maxCrew;
	}

	@Override
	public  String namePicker()
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