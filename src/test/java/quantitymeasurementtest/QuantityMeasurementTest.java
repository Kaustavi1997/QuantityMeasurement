package quantitymeasurementtest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import quantitymeasurement.exception.QuantityMeasurementException;
import quantitymeasurement.model.Length;
import quantitymeasurement.service.QuantityMeasurement;
import quantitymeasurement.utility.UnitConverterFactor;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    @Before
    public void initialize(){
        quantityMeasurement = new QuantityMeasurement();
    }
    @Test
    public void givenFeet_ShouldReturnInch() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(2.5, UnitConverterFactor.FEET_TO_INCH);
        Assert.assertEquals(30,result,0.0);
    }
    @Test
    public void whenGivenTwoFeetValue_ifEqual_shouldReturnTrue() {
        Length feet = new Length(0.0, Length.Unit.FEET);
        Assert.assertEquals(feet,new Length(0.0, Length.Unit.FEET));
    }
    @Test
    public void whenGivenFeetValue_CheckForReference() {
        Length feet = new Length(2.0, Length.Unit.FEET);
        boolean equal = feet.equals(feet);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenGiven1FeetAnd1inch_ShouldReturnNotEqual(){
        Length feet = new Length(1.0, Length.Unit.FEET);
        Length inch = new Length(1.0, Length.Unit.INCH);
        Assert.assertNotEquals(feet,inch);
    }
    @Test
    public void whenNullForFeet_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitConverterFactor.FEET_TO_INCH);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void whenGivenTwoInchValue_ifEqual_shouldReturnTrue() {
        Length inch = new Length(0.0, Length.Unit.INCH);
        Assert.assertEquals(inch,new Length(0.0, Length.Unit.INCH));
    }
    @Test
    public void whenGivenInchValue_CheckForReference() {
        Length inch = new Length(0.0, Length.Unit.INCH);
        boolean equal = inch.equals(inch);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenNullForInch_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitConverterFactor.INCH_TO_FEET);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void givenInch_ShouldReturnFeet() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(36.0, UnitConverterFactor.INCH_TO_FEET);
        Assert.assertEquals(2.988,result,0.0);
    }
    @Test
    public void givenFeet_ShouldReturnYard() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(3.0, UnitConverterFactor.FEET_TO_YARD);
        Assert.assertEquals(1,result,0.1);
    }
    @Test
    public void givenFeet_NotEqualToYard() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(1.0, UnitConverterFactor.FEET_TO_YARD);
        Assert.assertNotEquals(1.0,result,0.0);
    }
    @Test
    public void givenInch_NotEqualToYard() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(1.0, UnitConverterFactor.INCH_TO_YARD);
        Assert.assertNotEquals(1.0,result,0.0);
    }
    @Test
    public void givenYard_ShouldReturnInch() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(1.0, UnitConverterFactor.YARD_TO_INCH);
        Assert.assertEquals(36.0,result,0.0);
    }
    @Test
    public void givenYard_ShouldReturnFeet() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(1.0, UnitConverterFactor.YARD_TO_FEET);
        Assert.assertEquals(3,result,0.0);
    }

    @Test
    public void whenGivenTwoCentimeterValue_ifEqual_shouldReturnTrue() {
        Length centimeter = new Length(0.0, Length.Unit.CENTIMETER);
        Assert.assertEquals(centimeter,new Length(0.0, Length.Unit.CENTIMETER));
    }
    @Test
    public void whenGivenCentimeterValue_CheckForReference() {
        Length centimeter = new Length(0.0, Length.Unit.CENTIMETER);
        boolean equal = centimeter.equals(centimeter);
        Assert.assertEquals(true,equal);
    }

    @Test
    public void whenGiven1InchAnd1Cm_ShouldReturnNotEqual() {
        Length centimeter = new Length(1.0, Length.Unit.CENTIMETER);
        Length inch = new Length(1.0, Length.Unit.INCH);
        Assert.assertNotEquals(centimeter,inch);
    }

    @Test
    public void whenNullForCentimeter_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitConverterFactor.INCH_TO_CM);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void givenInch_ShouldReturnCm() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(2.0, UnitConverterFactor.INCH_TO_CM);
        Assert.assertEquals(5.0,result,0.0);
    }
}
