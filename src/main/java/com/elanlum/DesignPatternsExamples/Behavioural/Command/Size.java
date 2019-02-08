package com.elanlum.DesignPatternsExamples.Behavioural.Command;

public enum Size {

  SMALL("small"), NORMAL("normal");

  private String title;

  Size(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
