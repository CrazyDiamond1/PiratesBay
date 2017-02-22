package models;

public class Ship extends Loot
{
	private int SpeedMod;
	
	public Ship()
	{
		
	}

	public int getSpeedMod() {
		return SpeedMod;
	}

	public void setSpeedMod(int speedMod) {
		SpeedMod = speedMod;
	}
}
