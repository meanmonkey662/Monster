package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshallows.view.MonsterDisplay;
import java.util.Scanner;


public class MonsterController
{
	private MarshmallowMonster kyleMonster; //Declares a Monster called kyleMonster.
	private MarshmallowMonster userMonster;
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
		createUserMonster();
		myDisplay.displayInfo("User monster info: " + userMonster.toString());
	}
	
	private void askQuestions()
	
	{
		System.out.println("I want a new name for my monster, type one please!");
		String newMonsterName = monsterScanner.next();
		kyleMonster.setMonsterName(newMonsterName);
		
		System.out.println("Give me a new number of noses!");
		int newMonsterNoses = monsterScanner.nextInt();
		kyleMonster.setMonsterNoses(newMonsterNoses);
		
		System.out.println("Give me a new number of eyes!!");
		int newMonsterEyes = monsterScanner.nextInt();
		kyleMonster.setMonsterEyes(newMonsterEyes);
		
		System.out.println("Now give me a new number of belly buttons!!!");
		boolean newhasBellyButtons = monsterScanner.nextBoolean();
		kyleMonster.setMonsterBellyButton(newhasBellyButtons);
		
		System.out.println("Give me a new number of legs!!!!");
		double newMonsterLegs = monsterScanner.nextDouble();
		kyleMonster.setMonsterLegs(newMonsterLegs);
		
		System.out.println("Give me an new number of hair!!!!!");
		double newMonsterHair = monsterScanner.nextDouble();
		kyleMonster.setMonsterHair(newMonsterHair);
		
		
		
	}
	/**
	 * Creates a MarshmallowMonster instance from user input.
	 */
	private void createUserMonster()
	{
		//Step one: Gather user Info.
		System.out.println("What is your monsters name?");
		String userName;
		userName = monsterScanner.nextLine();
		System.out.println("How many legs will it have? This is a decimal value");
		double userLegs = monsterScanner.nextDouble();
		System.out.println("How much hair does it have?, another decimal value");
		double userHair;
		userHair = monsterScanner.nextDouble();
		System.out.println("Does it have a belly button - true or false?");
		boolean userBellyButton = monsterScanner.nextBoolean();
		System.out.println("Numberof eyes on the monster");
		int userEyes = monsterScanner.nextInt();
		System.out.println("How many noses does it have?");
		int userNoses = monsterScanner.nextInt();
		
		//Step two: Build the monster using the constructor.
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, userBellyButton, userLegs, userHair);
		
		
		
	}
}
