package marshmallows.model;

public class MarshmallowMonster
{
	
	
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
	
	private MarshmallowMonster()     			
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, 
			int monsterNoses, boolean monsterBellyButton,
			double monsterLegs, double monsterHair)
			{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterNoses = monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
			}
			
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + " legs and its' name is " + monsterName + " He has " +
	monsterNoses + " noses, " + monsterEyes + " eyes," + " and " + monsterHair + " Hairs";
		
		return monsterInfo;
	}
}
