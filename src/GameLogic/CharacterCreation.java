package GameLogic;


import java.util.Scanner;
import PlayerClasses.*;

/**
 * Created by dax on 8/24/16.
 */
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
}
