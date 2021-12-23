package com.solid.principles.interfacesegregationprinciple.bad;

/**
 * ToyHouse needs to provide implementation of the move() and fly() methods, even though it does not
 * require them
 */
public class ToyHouse implements Toy {
  private double price;
  private String color;

  @Override
  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void move() {}

  @Override
  public void fly() {}
}
