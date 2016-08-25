package EnemyClasses;


public class Enemy {
  String enemyName;
  String enemyDesc;
  int healthPoints;
  int experiencePoints;


  public String getEnemyName() {
    return enemyName;
  }

  public void setEnemyName(String enemyName) {
    this.enemyName = enemyName;
  }

  public String getEnemyDesc() {
    return enemyDesc;
  }

  public void setEnemyDesc(String enemyDesc) {
    this.enemyDesc = enemyDesc;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }

  public String toString(){
    return "Name: " + enemyName + ", Description: " + enemyDesc + ", HP: " + healthPoints;
  }
}
