package com.elanlum.DesignPatternsExamples.Creational.Builder;

public class Car {

  public void buildBase(){
    System.out.println("Build base");
  }

  public void buildWheels(){
    System.out.println("Add wheels");
  }

  public void buildEngine(Engine engine){
    System.out.println("Add engine of type: " + engine.getEngineType());
  }
}
