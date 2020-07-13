package quantitymeasurementtest;
import exception.QuantityMeasurementException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import quantitymeasurement.model.Feet;
import quantitymeasurement.service.QuantityMeasurement;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    @Before
    public void initialize(){
        quantityMeasurement = new QuantityMeasurement();
    }
    @Test
    public void givenFeet_ShouldReturnInch() {
        double result = quantityMeasurement.feetToInch(2.5);
        Assert.assertEquals(30,result,0.0);
    }
    @Test
    public void whenGivenTwoFeetValue_ifEqual_shouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Assert.assertEquals(feet,new Feet(0.0));
    }
    @Test
    public void whenNull_ShouldCheck(){
        try {
            Feet feet = new Feet(null);
        }catch(NullPointerException e){
            System.out.println("null value provided");
        }
    }
}
