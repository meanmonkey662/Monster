package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshallows.view.MonsterDisplay;
import java.util.Scanner;


public class MonsterController
{
	private MarshmallowMonster kyleMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "I.C. Weiner";
		int eyes = 2;
		int noses = 4;
		double legs = 15;
		double hair = 1000;
		boolean hasBellyButton = false;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		kyleMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(kyleMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + kyleMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for my monster, type one please!");
		String newMonsterName = monsterScanner.next();
		kyleMonster.setMonsterName(newMonsterName);
		System.out.println("Give me a new number of noses!");
		int updatedNoses = monsterScanner.nextInt();
		System.out.println("Give me a new number of eyes!!");
		int updatedEyes = monsterScanner.nextInt();
		System.out.println("Now give me a new number of belly buttons!!!");
		boolean updatedBellyButtons = monsterScanner.nextBoolean();
		System.out.println("Give me a new number of legs!!!!");
		double updatedLegs = monsterScanner.nextDouble();
		System.out.println("Give me an new number of hair!!!!!");
		double updatedHair = monsterScanner.nextDouble();
		
		
		
	}
}
