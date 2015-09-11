package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshallows.view.MonsterDisplay;

public class MonsterController
{
	private MarshmallowMonster kyleMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "I.C. Weiner";
		int eyes = 2;
		int noses = 4;
		double legs = 15;
		double hair = 1000;
		boolean hasBellyButton = false;
	
		myDisplay = new MonsterDisplay();
		kyleMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(kyleMonster.toString());
	}
	
}
