package PlayerClasses;

/*
  Defines default Thief properties.
  - Dax
 */
public class Thief extends Player {
  public Thief() {
    healthPoints = 35;
    magicPoints = 35;
    className = "Thief";
    characterName = "Thief";
    characterSkills = new String[]{ "Attack", "Block", "Steal"};
  }

  public Thief(String newName) {
    healthPoints = 35;
    magicPoints = 35;
    className = "Thief";
    characterName = newName;
    characterSkills = new String[]{ "Attack", "Block", "Steal"};
  }
}
