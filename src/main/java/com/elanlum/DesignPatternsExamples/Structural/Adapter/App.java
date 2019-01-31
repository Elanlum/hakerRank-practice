package com.elanlum.DesignPatternsExamples.Structural.Adapter;

public class App {

  public static void main(String[] args) {
    BBank bBank = new BBank();
    
    bBank.getBalance();

    BBankAdapter aBank = new BBankAdapter(new ABank());
    aBank.getBalance();
  }
}
