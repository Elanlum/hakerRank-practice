package com.elanlum.DesignPatternsExamples.Singleton;

public class SingletoneSimpliest {
  public static final SingletoneSimpliest INSTANCE = new SingletoneSimpliest();

  private SingletoneSimpliest() {
  }
}
