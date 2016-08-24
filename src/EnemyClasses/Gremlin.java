/*
  Defines default properties and constructors for Gremlins.
  - Dax
 */

package EnemyClasses;

public class Gremlin extends Enemy{
  public Gremlin(){
    enemyName = "Gremlin";
    enemyDesc = "Ew, what even is this thing?";
    healthPoints = 20;
    experiencePoints = 20;
  }

  public Gremlin(String name){
    enemyName = name;
    enemyDesc = "Ew, what even is this thing?";
    healthPoints = 20;
    experiencePoints = 20;
  }
}
