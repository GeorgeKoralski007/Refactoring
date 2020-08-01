

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Ogre extends Monster
{
	 static String name = "Oscar the Ogre";
	 static int hitPoints=200;
	 static int attackSpeed=2; 
	 static double chanceToHit=.6;
	 static double chanceToHeal =.1;
	 static  int damageMin=30;
	 static int damageMax=50;
	 static int minHeal = 30;
	 static int maxHeal = 50;
    public Ogre()
	{
		super(name, hitPoints, attackSpeed, chanceToHit, chanceToHeal,
				damageMin, damageMax, minHeal, maxHeal);


    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slowly swings a club toward's " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end Monster class