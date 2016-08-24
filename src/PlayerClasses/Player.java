/*
  Defines default Player parameters and methods.
  - Dax
 */

package PlayerClasses;

import java.util.HashMap;
import GameLogic.CharacterCreation;

public class Player {
  int healthPoints;
  int magicPoints;
  String characterName;
  String className;
  String[] characterSkills;
  int strength;
  int intelligence;
  int speed;

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

  public int getStrength(){
    return strength;
  }

  public void setStrength(int newStr){
    strength = newStr;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public HashMap getStats(){
    HashMap hm = new HashMap();
    CharacterCreation newCharacter = new CharacterCreation();

    hm.put(strength, newCharacter.rollStat());
    hm.put(intelligence, newCharacter.rollStat());
    hm.put(speed, newCharacter.rollStat());

    return hm;
  }

  public void setStats(int strength, int intelligence, int speed) {
    this.strength = strength;
    this.intelligence = intelligence;
    this.speed = speed;
  }

  public String toString(){
    return characterName + ": [ Class: " + className + ", HP: " + healthPoints + ", MP: " + magicPoints + " ]";
  }

  public void listSkills(){
    System.out.println("Skills:");

    for (String skill : characterSkills){
      System.out.println(skill);
    }
  }
}
