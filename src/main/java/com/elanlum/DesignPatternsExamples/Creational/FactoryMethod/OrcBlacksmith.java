package com.elanlum.DesignPatternsExamples.Creational.FactoryMethod;

public class OrcBlacksmith implements BlackSmith {

  @Override
  public Weapon manufactureWeapon(WeaponType weaponType) {
    return new OrcWeapon(weaponType);
  }
}
