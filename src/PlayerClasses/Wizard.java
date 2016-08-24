package PlayerClasses;

/*
  Defines default Wizard properties.
  - Dax
 */
public class Wizard extends Player {

  public Wizard(){
    healthPoints = 35;
    magicPoints = 35;
    className = "Wizard";
    characterName = "Wizard";
    characterSkills = new String[]{ "Attack", "Block", "Fireball"};
  }

  public Wizard(String newName){
    healthPoints = 35;
    magicPoints = 35;
    className = "Wizard";
    characterName = newName;
    characterSkills = new String[]{ "Attack", "Block", "Fireball"};
  }

}
