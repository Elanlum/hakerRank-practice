package com.elanlum.DesignPatternsExamples.Creational.Singleton;

public class SingletoneSimpliest {
  public static final SingletoneSimpliest INSTANCE = new SingletoneSimpliest();

  private SingletoneSimpliest() {
  }
}
