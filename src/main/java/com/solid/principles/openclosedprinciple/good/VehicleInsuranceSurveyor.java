package com.solid.principles.openclosedprinciple.good;

public class VehicleInsuranceSurveyor implements InsuranceSurveyor {

  public boolean isValidClaim() {
    System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
    /*Logic to validate vehicle insurance claims*/
    return true;
  }
}
