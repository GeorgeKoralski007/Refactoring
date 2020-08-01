

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Skeleton extends Monster
{	
	 static String name = "Sargath the Skeleton";
	 static int hitPoints=100;
	 static int attackSpeed=3; 
	 static double chanceToHit=.8;
	 static double chanceToHeal =.3;
	 static  int damageMin=30;
	 static int damageMax=50;
	 static int minHeal = 30;
	 static int maxHeal = 50;
    public Skeleton()
	{
		super(name, hitPoints, attackSpeed, chanceToHit, chanceToHeal, 
				damageMin, damageMax, minHeal, maxHeal);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slices his rusty blade at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Skeleton