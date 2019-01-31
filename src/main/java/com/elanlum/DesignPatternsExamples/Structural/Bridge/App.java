package com.elanlum.DesignPatternsExamples.Structural.Bridge;

public class App {

  public static void main(String[] args) {
    System.out.println("The knight receives an enchanted sword.");
    Sword enchantedSword = new Sword(new SoulEatingEnchantment());
    enchantedSword.wield();
    enchantedSword.swing();
    enchantedSword.unwield();

    System.out.println("The valkyrie receives an enchanted hammer.");
    Hammer hammer = new Hammer(new FlyingEnchantment());
    hammer.wield();
    hammer.swing();
    hammer.unwield();
  }

}
