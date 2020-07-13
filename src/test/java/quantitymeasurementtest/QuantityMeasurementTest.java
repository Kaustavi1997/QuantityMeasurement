package quantitymeasurementtest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import quantitymeasurement.model.Feet;
import quantitymeasurement.model.Inch;
import quantitymeasurement.service.QuantityMeasurement;
import quantitymeasurement.utility.UnitConverterFactor;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    @Before
    public void initialize(){
        quantityMeasurement = new QuantityMeasurement();
    }
    @Test
    public void givenFeet_ShouldReturnInch() {
        double result = quantityMeasurement.converter(2.5, UnitConverterFactor.FEET_TO_INCH);
        Assert.assertEquals(30,result,0.0);
    }
    @Test
    public void whenGivenTwoFeetValue_ifEqual_shouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Assert.assertEquals(feet,new Feet(0.0));
    }
    @Test
    public void whenNullForFeet_ShouldCheck(){
        try {
            Feet feet = new Feet(null);
        }catch(NullPointerException e){
            System.out.println("null value provided");
        }
    }
    @Test
    public void whenGivenTwoInchValue_ifEqual_shouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Assert.assertEquals(inch,new Inch(0.0));
    }
    @Test
    public void whenNullForInch_ShouldCheck(){
        try {
            Inch inch = new Inch(null);
        }catch(NullPointerException e){
            System.out.println("null value provided");
        }
    }
    @Test
    public void givenInch_ShouldReturnFeet() {
        double result = quantityMeasurement.converter(36, UnitConverterFactor.INCH_TO_FEET);
        Assert.assertEquals(2.988,result,0.0);
    }
    @Test
    public void givenFeet_ShouldReturnYard() {
        double result = quantityMeasurement.converter(3, UnitConverterFactor.FEET_TO_YARD);
        Assert.assertEquals(1,result,0.1);
    }
    @Test
    public void givenFeet_NotEqualToYard() {
        double result = quantityMeasurement.converter(1.0, UnitConverterFactor.FEET_TO_YARD);
        Assert.assertNotEquals(1.0,result,0.0);
    }
    @Test
    public void givenInch_NotEqualToYard() {
        double result = quantityMeasurement.converter(1.0, UnitConverterFactor.INCH_TO_YARD);
        Assert.assertNotEquals(1.0,result,0.0);
    }
    @Test
    public void givenYard_ShouldReturnInch() {
        double result = quantityMeasurement.converter(1.0, UnitConverterFactor.YARD_TO_INCH);
        Assert.assertEquals(36.0,result,0.0);
    }
    @Test
    public void givenYard_ShouldReturnFeet() {
        double result = quantityMeasurement.converter(1, UnitConverterFactor.YARD_TO_FEET);
        Assert.assertEquals(3,result,0.0);
    }

}
