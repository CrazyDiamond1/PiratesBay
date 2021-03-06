package models;

public abstract class Character 
{
	protected String captainName;
	protected int ATK;
	protected int DEF;
	protected int crewCount;
	protected int gold;
	protected Ship ship;
	protected Equipment equipment;
		
	public abstract void takeDamage(int damage);
	
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
	public int getATK() {
		return ATK;
	}
	public void setATK(int aTK, int atkMod) {
		ATK = aTK + atkMod;
	}
	public int getDEF() {
		return DEF;
	}
	public void setDEF(int dEF, int defMod) {
		DEF = dEF + defMod;
	}
	
	public void updateATK()
	{
		ATK += equipment.getATKMod();
	}
	
	public void updateDEF()
	{
		DEF += equipment.getDEFMod();
	}
}
