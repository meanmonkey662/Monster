package marshmallows.model;

public class MarshmallowMonster
{
	private MarshmallowMonster kyleMonster;
	
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
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + "legs and its' name is " + monsterName;
		
		return monsterInfo;
	}
}
