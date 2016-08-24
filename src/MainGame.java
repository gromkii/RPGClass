/**
 * Created by dax on 8/24/16.
 */

import PlayerClasses.*;
import GameLogic.*;

import javax.sound.sampled.LineEvent;


public class MainGame {
  public static void main(String[] args){
    CharacterCreation newCharacter = new CharacterCreation();

    System.out.print("Enter a character class [Fighter, Wizard, Thief]: ");
    String characterClass = newCharacter.getCharacterClass();

    System.out.print("Enter a name for your character: ");
    String characterName = newCharacter.getCharacterName();

    Player player = newCharacter.makeNewCharacter(characterClass,characterName);

    System.out.println(player.toString() + '\n');
    player.listSkills();
  }
}
