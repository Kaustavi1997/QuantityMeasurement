package quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.QuantityMeasurement;

public class QuantityMeasurementTest {
    @Test
    public void givenFeet_ShouldReturnInch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result = quantityMeasurement.feetToInch(2.5);
        Assert.assertEquals(30,result,0.0);
    }
}
