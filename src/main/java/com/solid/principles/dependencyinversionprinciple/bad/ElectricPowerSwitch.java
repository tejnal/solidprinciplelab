package com.solid.principles.dependencyinversionprinciple.bad;

public class ElectricPowerSwitch {
  /**
   * Our high-level ElectricPowerSwitch class is directly dependent on the low-level LightBulb class
   */
  public LightBulb lightBulb;

  public boolean on;

  public ElectricPowerSwitch(LightBulb lightBulb) {
    this.lightBulb = lightBulb;
    this.on = false;
  }

  public boolean isOn() {
    return this.on;
  }

  public void press() {
    boolean checkOn = isOn();
    if (checkOn) {
      lightBulb.turnOff();
      this.on = false;
    } else {
      lightBulb.turnOn();
      this.on = true;
    }
  }
}
