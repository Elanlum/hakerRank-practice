package com.elanlum.DesignPatternsExamples.Singleton;

public class SingletoneSingleThread {

  private static SingletoneSingleThread instance = new SingletoneSingleThread();

  public static SingletoneSingleThread getInstance() {

    return instance;
  }

  private SingletoneSingleThread() {
  }
}
