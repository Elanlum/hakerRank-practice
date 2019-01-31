package com.elanlum.DesignPatternsExamples.Builder;

public class Build {

  private Builder builder;

  public Build(int builderType) {
    if(builderType == 1)
      builder = new FirstBuilder();
    else if(builderType == 2)
      builder = new SecondBuilder();
  }

  public Car buildCar(){
    return builder.buildCar();
  }
}
