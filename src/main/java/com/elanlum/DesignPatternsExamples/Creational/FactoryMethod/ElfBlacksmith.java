package com.elanlum.DesignPatternsExamples.FactoryMethod;

public class ElfBlacksmith implements BlackSmith {

  @Override
  public Weapon manufactureWeapon(WeaponType weaponType) {
    return new ElfWeapon(weaponType);
  }
}
