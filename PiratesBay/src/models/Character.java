package models;

public abstract class Character {

	protected String captainName;
	protected int crewCount;
	protected int gold;
	protected int combatEff;
	protected Ship ship;
	protected Equipment equipment;
		
	public abstract void takeDamage(int damage);
	public abstract int combatCalc();
	
	public String getCaptainName() {
		
		return captainName;
	}
	public void setCaptainName(String captainName) {
		
		this.captainName = captainName;
	}
	public int getCrewCount() {
		
		return crewCount;
	}
	public void setCrewCount(int crewCount) {
		
		this.crewCount = crewCount;
	}
	public int getGold() {
		
		return gold;
	}
	public void setGold(int gold) {
		
		this.gold = gold;
	}
	public int getCombatEff() {
		
		return combatEff;
	}
	public void setCombatEff(int combatEff) {
		
		this.combatEff = combatEff;
	}
	
	
}
