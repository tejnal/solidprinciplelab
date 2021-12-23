package com.solid.principles.dependencyinversionprinciple.bad;
/**
 * BASIC Dependency inversion principle A. High-level modules should not depend on low-level
 * modules. Both should depend on abstractions B. Abstractions should not depend on details. Details
 * should depend on abstractions.”
 */
public class LightBulb {

  public void turnOn() {
    System.out.println("LightBulb: Bulb turned on...");
  }

  public void turnOff() {
    System.out.println("LightBulb: Bulb turned off...");
  }
}
