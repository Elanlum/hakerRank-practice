package com.elanlum.DesignPatternsExamples.Creational.Builder;

public class FirstBuilder extends Builder {

  public FirstBuilder() {
    car = new Car();
  }

  @Override
  public Car buildCar() {

    car.buildBase();
    car.buildWheels();
    car.buildEngine(new V6());
    return car;
  }
}
