package models;

public class Ship extends Loot
{
	private int speedMod;
	private int DEFMod;
	
	public Ship()
	{
		this.name = namePicker();
		this.value = rand.nextInt(100) + 1;
		this.speedMod = rand.nextInt(30) + 1;
		this.DEFMod = rand.nextInt(30) + 1;
	}

	public int getSpeedMod() {
		return speedMod;
	}

	public void setSpeedMod(int speedMod) {
		this.speedMod = speedMod;
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
