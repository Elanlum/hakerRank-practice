package com.elanlum.DesignPatternsExamples.Creational.Builder;

public class SecondBuilder extends Builder{

  public SecondBuilder() {
    car = new Car();
  }

  @Override
  public Car buildCar() {
    car.buildBase();
    car.buildWheels();
    car.buildEngine(new V8());
    return car;
  }
}
