package PlayerClasses;

/**
 * Created by dax on 8/24/16.
 */
public class Player {
  protected int healthPoints;
  protected int magicPoints;
  protected String characterName;
  protected String className;
  protected String[] characterSkills;

  public int getHP(){
    return healthPoints;
  }

  public void setHP(int newHP){
    healthPoints = newHP;
  }

  public int getMP(){
    return magicPoints;
  }

  public void setMP(int newMP){
    magicPoints = newMP;
  }

  public String getCharacterName(){
    return characterName;
  }

  public void setCharacterName(String newName){
    characterName = newName;
  }

  public String getClassName(){
    return className;
  }

  public void setClassName(String newClass){
    className = newClass;
  }

  public String[] getCharacterSkills() {
    return characterSkills;
  }

  public void setCharacterSkills(String[] newSkills){
    characterSkills = newSkills;
  }

  public String toString(){
    return characterName + ": [ Class: " + className + ", HP: " + healthPoints + ", MP: " + magicPoints + " ]";
  }

  public void listSkills(){
    for (String skill : characterSkills){
      System.out.println(skill);
    }
  }

//  public Player(String newCharacterClass, String newCharacterName){
//    characterName = newCharacterName;
//    className = newCharacterClass;
//    healthPoints = 50;
//    magicPoints = 50;
//    characterSkills = new String[] {"Attack", "Defend"};
//  }
}
