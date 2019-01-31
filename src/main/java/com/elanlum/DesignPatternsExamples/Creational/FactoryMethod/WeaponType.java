package com.elanlum.DesignPatternsExamples.Creational.FactoryMethod;

public enum  WeaponType {
  SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

  String title;

  WeaponType(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
