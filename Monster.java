

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */


public abstract class Monster extends DungeonCharacter
{
	private double chanceToHeal;
	private int minHeal, maxHeal;

//-----------------------------------------------------------------
  protected Monster(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, double chanceToHeal,
					 int damageMin, int damageMax,
					 int minHeal, int maxHeal)
  {
	super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
	this.chanceToHeal = chanceToHeal;
	this.maxHeal = maxHeal;
	this.minHeal = minHeal;

  }//end monster construcotr

//-----------------------------------------------------------------
  private void heal()
  {	
	int healPoints;
	if (getCanHeal())
	{
		healPoints = getHealPoints();
		addHitPoints(healPoints);
		System.out.println(name + " healed itself for " + healPoints + " points.\n"
							+ "Total hit points remaining are: " + hitPoints);
		System.out.println();
	}//end can heal


  }//end heal method

//-----------------------------------------------------------------
  
 
  private int getHealPoints()
  {
	  int healPoints;
	  healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
	  return healPoints;
  }
  private boolean getCanHeal()
  {	
	  boolean canHeal;
		canHeal = (Math.random() <= chanceToHeal) && (hitPoints > 0);
	  return canHeal;
  }
 public void subtractHitPoints(int hitPoints)
 {
		super.subtractHitPoints(hitPoints);
		heal();

 }//end method


}//end Monster class