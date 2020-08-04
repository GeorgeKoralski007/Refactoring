

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Gremlin extends Monster
{
	 static String name = "Gnarltooth the Gremlin";
	 static int hitPoints=70;
	 static int attackSpeed=5; 
	 static double chanceToHit=.8;
	 static double chanceToHeal =.4;
	 static  int damageMin=15;
	 static int damageMax=30;
	 static int minHeal = 20;
	 static int maxHeal = 40;
    public Gremlin()
	{
		super(name, hitPoints, attackSpeed, chanceToHit, chanceToHeal,
				damageMin, damageMax, minHeal, maxHeal);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack
   
   public void specialSkill(DungeonCharacter opponent)
	{
   	int damagePoints = (int)(Math.random() * 20) + 50;
		System.out.println(name + " bytes at " + opponent.getName() + " with " + damagePoints
								+ " damage!");
		opponent.subtractHitPoints(damagePoints);
	}


}//end class Gremlin