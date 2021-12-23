package com.solid.principles.interfacesegregationprinciple.good.service;

import com.solid.principles.interfacesegregationprinciple.good.Flyable;
import com.solid.principles.interfacesegregationprinciple.good.Movable;
import com.solid.principles.interfacesegregationprinciple.good.Toy;

public class ToyPlane implements Toy, Movable, Flyable {

  /** he implementation classes now implement only those interfaces they are interested in */
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

    System.out.println("ToyPlane: Start moving plane.");
  }

  @Override
  public void fly() {

    System.out.println("ToyPlane: Start flying plane.");
  }

  @Override
  public String toString() {
    return "ToyPlane: Moveable and flyable toy plane- Price: " + price + " Color: " + color;
  }
}
