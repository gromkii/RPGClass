package PlayerClasses;

/**
 * Created by dax on 8/24/16.
 */
public class Fighter extends Player {
  public Fighter(){
    healthPoints = 50;
    magicPoints = 25;
    className = "Fighter";
    characterName = "Fighter";
    characterSkills = new String[]{"Attack", "Defend", "Chop"};
  }

  public Fighter(String newCharacterName){
    healthPoints = 50;
    magicPoints = 25;
    className = "Fighter";
    characterName = newCharacterName;
    characterSkills = new String[]{"Attack", "Defend", "Chop"};
  }
}
