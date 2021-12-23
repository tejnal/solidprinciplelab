package com.solid.principles.dependencyinversionprinciple.good;

public class ElectricPowerSwitch implements Switch {

  /**
   * In the ElectricPowerSwitch class we implemented the Switch interface and referred the
   * Switchable interface instead of any concrete class in a field.
   */
  public Switchable client;

  public boolean on;

  public ElectricPowerSwitch(Switchable client) {
    this.client = client;
    this.on = false;
  }

  public boolean isOn() {
    return this.on;
  }

  public void press() {
    boolean checkOn = isOn();
    if (checkOn) {
      client.turnOff();
      this.on = false;
    } else {
      client.turnOn();
      this.on = true;
    }
  }
}
