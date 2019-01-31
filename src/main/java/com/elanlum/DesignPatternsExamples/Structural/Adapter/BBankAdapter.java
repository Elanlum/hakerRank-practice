package com.elanlum.DesignPatternsExamples.Structural.Adapter;

public class BBankAdapter extends BBank {

  private ABank aBank;

  public BBankAdapter(ABank aBank) {
    this.aBank = aBank;
  }

  public void getBalance(){
    aBank.getBalance();
  }
}
