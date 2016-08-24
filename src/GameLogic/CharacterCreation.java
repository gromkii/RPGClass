/*
  Game Logic that handles the system i/o stream for creating a new character.
  - Dax
 */

package GameLogic;

import java.util.Random;
import java.util.Scanner;
import PlayerClasses.*;

public class CharacterCreation {
  Scanner userInput = new Scanner(System.in);


  public String getCharacterName(){
    String characterName = userInput.next();

    return characterName;
  }

  public String getCharacterClass(){
    String characterClass = userInput.next();

    return characterClass;
  }

  public Player makeNewCharacter(String characterClass, String characterName){
    switch (characterClass){
      case "Fighter":
        Fighter fighter = new Fighter(characterName);
        return fighter;
      case "Wizard":
        Wizard wizard = new Wizard(characterName);
        return wizard;
      case "Thief":
        Thief thief = new Thief(characterName);
        return thief;
      default:
        return null;
    }
  }

  public int rollStat(){
    int lowest = 0;
    int currentSum = 1;
    Random rand = new Random();

    for (int i = 0; i < 4; i++) {
      int d6 = rand.nextInt(6) + 1;

      if (d6 > lowest) {
        currentSum += d6;
      } else {
        lowest = d6;
      }
    }

    return currentSum;
  }

  public void setCharacterStats(){

  }
}
