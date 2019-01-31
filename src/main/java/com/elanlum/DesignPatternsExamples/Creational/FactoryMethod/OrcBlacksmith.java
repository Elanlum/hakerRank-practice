package com.elanlum.DesignPatternsExamples.FactoryMethod;

public class OrcBlacksmith implements BlackSmith {

  @Override
  public Weapon manufactureWeapon(WeaponType weaponType) {
    return new OrcWeapon(weaponType);
  }
}
