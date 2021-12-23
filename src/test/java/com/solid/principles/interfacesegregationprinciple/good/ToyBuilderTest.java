package com.solid.principles.interfacesegregationprinciple.good;


import com.solid.principles.interfacesegregationprinciple.good.service.ToyCar;
import com.solid.principles.interfacesegregationprinciple.good.service.ToyHouse;
import com.solid.principles.interfacesegregationprinciple.good.service.ToyPlane;
import org.junit.jupiter.api.Test;

class ToyBuilderTest {

    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse=ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    public void testBuildToyCar() throws Exception {
        ToyCar toyCar=ToyBuilder.buildToyCar();;
        System.out.println(toyCar);
    }

    @Test
    public void testBuildToyPlane() throws Exception {
        ToyPlane toyPlane=ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }

}
