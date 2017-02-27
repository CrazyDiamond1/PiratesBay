package models;

public class Equipment extends Loot
{
	private int ATKMod;
	private int DEFMod;
	
	public Equipment()
	{
		this.name = namePicker();
		this.ATKMod = rand.nextInt(30) + 1;
		this.DEFMod = rand.nextInt(30) + 1;
	}
	
	public int getATKMod() {
		return ATKMod;
	}
	public void setATKMod(int aTKMod) {
		ATKMod = aTKMod;
	}
	public int getDEFMod() {
		return DEFMod;
	}
	public void setDEFMod(int dEFMod) {
		DEFMod = dEFMod;
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
			"Respawining Watermelon",
		};
		int i = rand.nextInt(8);
		
		return names[i];
	}
	
}
