package com.elanlum.DesignPatternsExamples.Structural.Proxy;

public class IvoryTower implements WizardTower {

  public void enter(Wizard wizard) {

    System.out.println(wizard + " enters the tower.");
  }

}
