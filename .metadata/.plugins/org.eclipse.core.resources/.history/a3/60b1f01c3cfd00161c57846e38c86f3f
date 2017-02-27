package models;

public class Equipment extends Loot
{
	private int damageMod;
	private int speedMod;
	
	public Equipment()
	{
		this.name = namePicker();
		this.damageMod = rand.nextInt(100)+1;
		this.speedMod = rand.nextInt(0)-30;
	}

	public int getDamageMod() {
		return damageMod;
	}

	public void setDamageMod(int damageMod) {
		this.damageMod = damageMod;
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
			"Golden Cannons",
			"Powerful Ram",
			"Copper Cannons",
			"ballista",
			"Grape Shot",
			"Chain Shot",
			"Heavy Shot",
		};
		int i = rand.nextInt(7);
		
		return names[i];
	}
	
}
