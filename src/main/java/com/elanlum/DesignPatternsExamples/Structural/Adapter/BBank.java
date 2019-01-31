package com.elanlum.DesignPatternsExamples.Structural.Adapter;

public class BBank {

  private int balance;

  public BBank() {
    balance = 200;
  }

  public void getBalance(){
    System.out.println("BBank balance = " + balance);
  }
}
