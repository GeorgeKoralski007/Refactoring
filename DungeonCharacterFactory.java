public class DungeonCharacterFactory
{
   public static Hero createHero(final int choice)
   {
      switch(choice)
		{
			case 1: return new Warrior();
			case 2: return new Sorceress();
			case 3: return new Thief();
         case 4: return new King();
			default: throw new IllegalArgumentException("choice is not valid");
		}
   }
   
   public static Monster createMonster(final int choice)
	{
		switch(choice)
		{
			case 1: return new Ogre();
			case 2: return new Gremlin();
			case 3: return new Skeleton();
			default: throw new IllegalArgumentException("choice is not valid");
		}
	}

}