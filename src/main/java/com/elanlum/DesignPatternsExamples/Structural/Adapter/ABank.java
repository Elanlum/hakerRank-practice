package com.elanlum.DesignPatternsExamples.Structural.Adapter;

public class ABank {

  private int balance;

  public ABank() {
    balance = 100;
  }

  public void getBalance(){
    System.out.println("ABank balance = " + balance);
  }
}
