package com.elanlum.DesignPatternsExamples.Creational.AbstractFactory;

public class UaAbstractCarFactory implements AbstractCarFactory {

  @Override
  public Lada getLadaInstance() {
    return new UaLada();
  }

  @Override
  public Ferrari getFerrariInstacne() {
    return new UaFerrari();
  }

  @Override
  public Mercedes getMercedesInstance() {
    return new UaMercedes();
  }
}
