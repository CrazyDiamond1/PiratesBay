package models;

public class Equipment extends Loot
{
	private int damageMod;
	private int speedMod;
	
	public Equipment()
	{
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
	
}
