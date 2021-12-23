package com.solid.principles.interfacesegregationprinciple.good.service;

import com.solid.principles.interfacesegregationprinciple.good.Movable;
import com.solid.principles.interfacesegregationprinciple.good.Toy;

public class ToyCar implements Toy, Movable {

  double price;
  String color;

  @Override
  public void setPrice(double price) {

    this.price = price;
  }

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void move() {
    System.out.println("ToyCar: Start moving car.");
  }

  @Override
  public String toString() {
    return "ToyCar: Moveable Toy car- Price: " + price + " Color: " + color;
  }
}
