

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Thief extends Hero
{
	
	//created fields to be used in the super call to make the construction more readable
	private static int hitPoints = 75;
	private static int attackSpeed = 6;
	private static double chanceToHit = .8;
	private static int damageMin = 20;
	private static int damageMax = 40;
	private static double chanceToBlock = .5;

    public Thief()
	{
		super("Thief", hitPoints , attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock);



    }//end constructor

	private void surpriseAttack(DungeonCharacter opponent)
	{
		double surprise = Math.random();
		if (surprise <= .4) // 40% chance to get additional turn
		{
			System.out.println("Surprise attack was successful!\n" +
								name + " gets an additional turn.");
			numTurns++;
		}//end surprise
		else if (surprise >= .9) // 10% chance to skip the turn without attack
		{
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
								" blocked your attack!");
         return;
		} 
		attack(opponent);
	}//end surpriseAttack method


    public void battleChoices(DungeonCharacter opponent)
	{
		super.battleChoices(opponent);
		
		int choice;
		
		do
		{
		   choice = super.attackMenu("Suprise Attack on " + opponent.getName(), opponent);
		   
		    switch (choice)
		    {
			    case 1: attack(opponent);
			        break;
			    case 2: surpriseAttack(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch

			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }
}