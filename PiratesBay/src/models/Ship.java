package models;

public class Ship extends Loot
{
	private int speedMod;
	
	public Ship()
	{
		this.value = rand.nextInt(100) + 1;
		this.speedMod = rand.nextInt(31);
	}

	public int getSpeedMod() {
		return speedMod;
	}

	public void setSpeedMod(int speedMod) {
		this.speedMod = speedMod;
	}
}
