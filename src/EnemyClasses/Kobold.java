package EnemyClasses;

/*
  Defines default Kobold enemy and constuctors.
  - Dax
 */
public class Kobold extends Enemy {
  public Kobold() {
    enemyName = "Kobold";
    enemyDesc = "A fluffy little monster who's almost too cute to smash. Almost.";
    healthPoints = 10;
    experiencePoints = 20;
  }
  public Kobold(String name) {
    enemyName = name;
    enemyDesc = "A fluffy little monster who's almost too cute to smash. Almost.";
    healthPoints = 10;
    experiencePoints = 20;
  }
}
