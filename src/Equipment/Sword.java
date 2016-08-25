package Equipment;

/*
  Defines sword constructors and properties.
  - Dax
 */
public class Sword extends Weapon {
  public Sword(){
    weaponName = "Sword";
    weaponDesc = "An ordinary sword. The blade is a bit dull, and there are signs of wear.";
    weaponDamage = 10;
    weaponSpeed = 5;
  }

  public Sword(String swordName) {
    weaponName = swordName;
    weaponDesc = "A well crafted sword, but otherwise pretty normal.";
    weaponDamage = 12;
    weaponSpeed = 5;
  }

  public Sword(String swordName, String swordDesc) {
    weaponName = swordName;
    weaponDesc = swordDesc;
    weaponDamage = 15;
    weaponSpeed = 6;
  }

  public Sword(String swordName, String swordDesc, int swordDamage){
    weaponName = swordName;
    weaponDesc = swordDesc;
    weaponDamage = swordDamage;
    weaponSpeed = 6;
  }

  public Sword(String swordName, String swordDesc, int swordDamage, int swordSpeed){
    weaponName = swordName;
    weaponDesc = swordDesc;
    weaponDamage = swordDamage;
    weaponSpeed = swordSpeed;gi
  }
}
