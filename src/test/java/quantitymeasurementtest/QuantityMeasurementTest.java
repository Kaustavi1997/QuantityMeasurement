package quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.service.Feet;
import quantitymeasurement.service.QuantityMeasurement;

public class QuantityMeasurementTest {
    @Test
    public void givenFeet_ShouldReturnInch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result = quantityMeasurement.feetToInch(2.5);
        Assert.assertEquals(30,result,0.0);
    }
    @Test
    public void whenGivenTwoSameFeetValue_shouldReturnTrue() {
        Feet feet = new Feet(0);
        Assert.assertEquals(feet,new Feet(0));
    }
}
