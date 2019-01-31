package com.elanlum.DesignPatternsExamples.Creational.Singleton;

public class SingletoneMultiThread {

  private static SingletoneMultiThread instance = null;

  private SingletoneMultiThread() {
  }

  public SingletoneMultiThread getInstance() {
    if (instance == null) {
      synchronized (SingletoneMultiThread.class) {
        if (instance == null) {
          instance = new SingletoneMultiThread();
        }
      }
    }
    return instance;
  }
}
