package models;

public class Ship extends Loot
{
	private int speedMod;
	
	public Ship()
	{
		
		speedMod = rand.nextInt(31);
	}

	public int getSpeedMod() {
		return speedMod;
	}

	public void setSpeedMod(int speedMod) {
		this.speedMod = speedMod;
	}
}
