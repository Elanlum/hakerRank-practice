package com.elanlum.DesignPatternsExamples.Creational.Builder;

abstract class Builder {
  protected Car car;

  public abstract Car buildCar();
}
