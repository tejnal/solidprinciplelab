package com.solid.principles.openclosedprinciple.good;

public class ClaimApprovalManager {
  /**
   * Now this class is Open to support more types of insurance claims.
   *
   * <p>Closed for any modifications whenever support for a new type of claim is added.
   */
  public void processClaim(InsuranceSurveyor surveyor) {
    if (surveyor.isValidClaim()) {
      System.out.println(
          "ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
    }
  }
}
