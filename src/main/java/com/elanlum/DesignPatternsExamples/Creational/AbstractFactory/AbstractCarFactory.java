package com.elanlum.DesignPatternsExamples.Creational.AbstractFactory;

public interface AbstractCarFactory {

  Lada getLadaInstance();

  Ferrari getFerrariInstacne();

  Mercedes getMercedesInstance();
}
