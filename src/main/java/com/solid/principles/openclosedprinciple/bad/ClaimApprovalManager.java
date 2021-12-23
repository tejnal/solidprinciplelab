package com.solid.principles.openclosedprinciple.bad;

public class ClaimApprovalManager {

  /**
   * ClaimApprovalManager class responsible to approve claims this class start with processing
   * health claims new requirement arises to support vehicle claim we added support for process
   * vehicle claims in methods processVehicleClaim() this clear violation of open closed
   */
  public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
    if (surveyor.isValidClaim()) {
      System.out.println(
          "ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
    }
  }

  public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
    if (surveyor.isValidClaim()) {
      System.out.println(
          "ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
    }
  }
}
