/*
  Handles enemy logic and methods for creating new enemies.
  - Dax
 */

package GameLogic;

import EnemyClasses.*;
import java.util.Random;

public class EnemyBehavior {
  Random random = new Random();

  public Enemy spawnEnemy(){
    int enemyIndex = random.nextInt(3) + 1;
    switch (enemyIndex){
      case 1:
        Enemy goblin = new Goblin();
        return goblin;
      case 2:
        Enemy gremlin = new Gremlin();
        return gremlin;
      case 3:
        Enemy kobold = new Kobold();
        return kobold;
      default:
        return null;
    }
  }
}
