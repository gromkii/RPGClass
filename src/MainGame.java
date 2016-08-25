/**
 * Created by dax on 8/24/16.
 */

import EnemyClasses.Enemy;
import PlayerClasses.*;
import GameLogic.*;

public class MainGame {
  public static void main(String[] args){
    CharacterCreation newCharacter = new CharacterCreation();
    EnemyBehavior enemyBehavior = new EnemyBehavior();

    System.out.print("Enter a character class [Fighter, Wizard, Thief]: ");
    String characterClass = newCharacter.getCharacterClass();

    System.out.print("Enter a name for your character: ");
    String characterName = newCharacter.getCharacterName();

    Player player = newCharacter.makeNewCharacter(characterClass,characterName);

    System.out.println(player.toString() + '\n');
    player.setStats(newCharacter.rollStat(), newCharacter.rollStat(), newCharacter.rollStat());
    System.out.println("[ STR: " + player.getStrength() + ", INT: " + player.getIntelligence() + ", SPD: " + player.getSpeed() + " ] \n");
    player.listSkills();
    Enemy enemy = enemyBehavior.spawnEnemy();

    System.out.println("An enemy has appeared!");
    System.out.println(enemy.toString());
  }
}
