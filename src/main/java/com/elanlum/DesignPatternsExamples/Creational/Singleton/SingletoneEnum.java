package com.elanlum.DesignPatternsExamples.Creational.Singleton;

public enum SingletoneEnum {
  INSTANCE;

  int value;

  public int getValue(){
    return value;
  }

  public void setValue(int value){
    this.value = value;
  }
}
