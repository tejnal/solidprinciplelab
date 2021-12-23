package com.solid.principles.openclosedprinciple.good;

public interface InsuranceSurveyor {
  /**
   * a layer of abstraction by creating an abstract class to represent different claim validation
   * behaviors
   */
  public abstract boolean isValidClaim();
}
