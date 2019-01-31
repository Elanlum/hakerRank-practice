package com.elanlum.DesignPatternsExamples.Creational.FactoryMethod;

public class App {


  private final BlackSmith blackSmith;

  public App(BlackSmith blackSmith) {
    this.blackSmith = blackSmith;
  }

  public static void main(String[] args) {
    App app = new App(new OrcBlacksmith());
    app.manufactureWeapons();

    app = new App(new ElfBlacksmith());
    app.manufactureWeapons();
  }

  private void manufactureWeapons(){
    Weapon weapon;

    weapon = blackSmith.manufactureWeapon(WeaponType.AXE);
    System.out.println(weapon.toString());
    weapon = blackSmith.manufactureWeapon(WeaponType.SPEAR);
    System.out.println(weapon.toString());
  }
}
