package com.elanlum.DesignPatternsExamples.Creational.AbstractFactory;

public class App {

  private static String carFactory;

  public App(String carFactory) {
    this.carFactory = carFactory;
  }

  public static void main(String[] args) {
    App app = new App("RU");
    app.factoryTypeSelector(carFactory);

    app = new App("UA");
    app.factoryTypeSelector(carFactory);
  }

  private AbstractCarFactory factoryTypeSelector(String type){
    if(type == "RU"){
      System.out.println("Ru created");
      return new RuAbstractCarFactory();
    }
    else if (type == "UA") {
      System.out.println("Ua created");
      return new UaAbstractCarFactory();
    }
    else throw new UnsupportedOperationException("Smth went wrong");
  }
}
