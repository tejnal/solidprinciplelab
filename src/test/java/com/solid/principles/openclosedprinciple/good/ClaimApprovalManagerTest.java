package com.solid.principles.openclosedprinciple.good;

import org.junit.jupiter.api.Test;



class ClaimApprovalManagerTest {

    @Test
    public void testProcessClaim() throws Exception {
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();

        ClaimApprovalManager claim1 = new ClaimApprovalManager();

        // Claim approval is handling health insurance here
        claim1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();

        ClaimApprovalManager claim2 = new ClaimApprovalManager();

        //claim approval is handling vehicle insurance here
        claim2.processClaim(vehicleInsuranceSurveyor);
    }

}
