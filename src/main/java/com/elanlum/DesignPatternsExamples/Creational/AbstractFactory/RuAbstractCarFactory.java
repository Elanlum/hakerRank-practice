package com.elanlum.DesignPatternsExamples.Creational.AbstractFactory;

public class RuAbstractCarFactory implements AbstractCarFactory {

  @Override
  public Lada getLadaInstance() {
    return new RuLada();
  }

  @Override
  public Ferrari getFerrariInstacne() {
    return new RuFerrari();
  }

  @Override
  public Mercedes getMercedesInstance() {
    return new RuMercedes();
  }
}
