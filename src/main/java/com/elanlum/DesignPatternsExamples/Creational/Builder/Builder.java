package com.elanlum.DesignPatternsExamples.Builder;

abstract class Builder {
  protected Car car;

  public abstract Car buildCar();
}
