package com.solid.principles.interfacesegregationprinciple.good;

import com.solid.principles.interfacesegregationprinciple.good.service.ToyCar;
import com.solid.principles.interfacesegregationprinciple.good.service.ToyHouse;
import com.solid.principles.interfacesegregationprinciple.good.service.ToyPlane;

public class ToyBuilder {

  /**
   * we wrote the ToyBuilder class with three static methods to create objects of the ToyHouse,
   * ToyCar, and ToyPlane classes.
   */
  public static ToyHouse buildToyHouse() {
    ToyHouse toyHouse = new ToyHouse();
    toyHouse.setPrice(15.00);
    toyHouse.setColor("green");
    return toyHouse;
  }

  public static ToyCar buildToyCar() {
    ToyCar toyCar = new ToyCar();
    toyCar.setPrice(25.00);
    toyCar.setColor("red");
    toyCar.move();
    return toyCar;
  }

  public static ToyPlane buildToyPlane() {
    ToyPlane toyPlane = new ToyPlane();
    toyPlane.setPrice(125.00);
    toyPlane.setColor("white");
    toyPlane.move();
    toyPlane.fly();
    return toyPlane;
  }
}
