package EnemyClasses;

/*
  Defines default Goblin properties and constructors.
  - Dax
 */
public class Goblin extends Enemy {
  public Goblin(){
    enemyName = "Goblin";
    enemyDesc = "Look at this little piece of shit. Kill him.";
    healthPoints = 20;
    experiencePoints = 25;
  }
  public Goblin(String name){
    enemyName = name;
    enemyDesc = "Look at this little piece of shit. Kill him.";
    healthPoints = 20;
    experiencePoints = 25;
  }
}
