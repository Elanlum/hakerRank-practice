package com.elanlum.DesignPatternsExamples.AbstractFactory;

public interface AbstractCarFactory {

  Lada getLadaInstance();

  Ferrari getFerrariInstacne();

  Mercedes getMercedesInstance();
}
