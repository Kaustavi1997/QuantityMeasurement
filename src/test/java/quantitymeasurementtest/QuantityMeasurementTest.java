package quantitymeasurementtest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import quantitymeasurement.exception.QuantityMeasurementException;
import quantitymeasurement.model.*;
import quantitymeasurement.service.QuantityMeasurement;
import quantitymeasurement.utility.UnitVariation;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    @Before
    public void initialize(){
        quantityMeasurement = new QuantityMeasurement();
    }
    @Test
    public void givenFeet_ShouldReturnInch() throws QuantityMeasurementException {
        double result = quantityMeasurement.converter(2.5, UnitVariation.FEET);
        Assert.assertEquals(30,result,0.0);
    }
    @Test
    public void whenGivenTwoFeetValue_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
       Unit feet1 = new Unit(0.0, UnitVariation.FEET);
        Assert.assertEquals(feet1,new Unit(0.0, UnitVariation.FEET));
    }
    @Test
    public void whenGivenFeetValue_CheckForReference() throws QuantityMeasurementException {
        Unit feet = new Unit(2.0, UnitVariation.FEET);
        boolean equal = feet.equals(feet);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenGivenFeetType_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit inch = new Unit(2.0, UnitVariation.INCH);
        Assert.assertEquals(inch,new Unit(2.0, UnitVariation.INCH));
    }
    @Test
    public void whenGiven1FeetAnd1inch_ShouldReturnNotEqual() throws QuantityMeasurementException {
        Unit feet = new Unit(1.0, UnitVariation.FEET);
        Unit inch = new Unit(1.0, UnitVariation.INCH);
        Assert.assertNotEquals(feet,inch);
    }
    @Test
    public void whenNullForFeet_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitVariation.FEET);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void whenGivenTwoInchValue_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit inch = new Unit(0.0, UnitVariation.INCH);
        Assert.assertEquals(inch,new Unit(0.0, UnitVariation.INCH));
    }
    @Test
    public void whenGivenInchValue_CheckForReference() throws QuantityMeasurementException {
        Unit inch = new Unit(0.0, UnitVariation.INCH);
        boolean equal = inch.equals(inch);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenNullForInch_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitVariation.FEET);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void given3Feet1Yard_ShouldReturnTrue_WhenCompared() throws QuantityMeasurementException {
        Unit feet = new Unit(3.0, UnitVariation.FEET);
        Unit yard = new Unit(1.0, UnitVariation.YARD);
        Assert.assertTrue(quantityMeasurement.compare(feet, yard));
    }
    @Test
    public void given1Feet1Yard_ShouldReturnFalse() throws QuantityMeasurementException {
        Unit feet = new Unit(1.0, UnitVariation.FEET);
        Unit yard = new Unit(1.0, UnitVariation.YARD);
        Assert.assertFalse(quantityMeasurement.compare(feet, yard));
    }
    @Test
    public void given1Inch1Yard_ShouldReturnFalse() throws QuantityMeasurementException {
        Unit inch = new Unit(1.0, UnitVariation.INCH);
        Unit yard = new Unit(1.0, UnitVariation.YARD);
        Assert.assertFalse(quantityMeasurement.compare(inch, yard));
    }
    @Test
    public void given1Yard36Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        Unit inch = new Unit(36.0, UnitVariation.INCH);
        Unit yard = new Unit(1.0, UnitVariation.YARD);
        Assert.assertTrue(quantityMeasurement.compare(yard, inch));
    }
    @Test
    public void given1Yard3Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        Unit yard = new Unit(1.0, UnitVariation.YARD);
        Unit feet = new Unit(3.0, UnitVariation.FEET);
        Assert.assertTrue(quantityMeasurement.compare(yard, feet));
    }
    @Test
    public void whenGivenTwoCentimeterValue_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit centimeter = new Unit(0.0, UnitVariation.CM);
        Assert.assertEquals(centimeter,new Unit(0.0, UnitVariation.CM));
    }
    @Test
    public void whenGivenCentimeterValue_CheckForReference() throws QuantityMeasurementException {
        Unit centimeter = new Unit(0.0, UnitVariation.CM);
        boolean equal = centimeter.equals(centimeter);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenGiven1InchAnd1Cm_ShouldReturnNotEqual() throws QuantityMeasurementException {
        Unit centimeter = new Unit(1.0, UnitVariation.CM);
        Unit inch = new Unit(1.0, UnitVariation.INCH);
        Assert.assertNotEquals(centimeter,inch);
    }
    @Test
    public void whenNullForCentimeter_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitVariation.CM);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void given2Inch5Cm_ShouldReturnTrue() throws QuantityMeasurementException {
        Unit inch = new Unit(2.0, UnitVariation.INCH);
        Unit centimeter = new Unit(5.0, UnitVariation.CM);
        Assert.assertTrue(quantityMeasurement.compare(inch, centimeter));
    }
    @Test
    public void whenGivenInchType_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit inch = new Unit(2.0, UnitVariation.INCH);
        Assert.assertEquals(inch,new Unit(2.0, UnitVariation.INCH));
    }
    @Test
    public void when2inchAnd2inchAdded_ShouldReturn4inch() throws QuantityMeasurementException {
        Unit inch1 = new Unit(2.0, UnitVariation.INCH);
        Unit inch2 = new Unit(2.0, UnitVariation.INCH);
        double result = quantityMeasurement.add(inch1, inch2);
        Assert.assertEquals(result, 4.0, 0.0);
    }
    @Test
    public void when1feetAnd2inchAdded_ShouldReturn14inch() throws QuantityMeasurementException {
        Unit feet = new Unit(1.0, UnitVariation.FEET);
        Unit inch = new Unit(2.0, UnitVariation.INCH);
        double result = quantityMeasurement.add(feet, inch);
        Assert.assertEquals(result, 14.0, 0.0);
    }
    @Test
    public void when1feetAnd1feetAdded_ShouldReturn24inch() throws QuantityMeasurementException {
        Unit feet1 = new Unit(1.0, UnitVariation.FEET);
        Unit feet2 = new Unit(1.0, UnitVariation.FEET);
        double result = quantityMeasurement.add(feet1, feet2);
        Assert.assertEquals(result, 24.0, 0.0001);
    }
    @Test
    public void wheninchAndCmAdded_ShouldReturninch() throws QuantityMeasurementException {
        Unit inch = new Unit(2.0, UnitVariation.INCH);
        Unit centimeter = new Unit(2.5, UnitVariation.CM);
        double result = quantityMeasurement.add(inch, centimeter);
        Assert.assertEquals(result, 3.0, 0.025);
    }
    @Test
    public void whenGivenTwoGallonValue_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit gallon = new Unit(0.0, UnitVariation.GALLON);
        Assert.assertEquals(gallon,new Unit(0.0, UnitVariation.GALLON));
    }
    @Test
    public void whenGivenGallonValue_CheckForReference() throws QuantityMeasurementException {
        Unit gallon = new Unit(0.0, UnitVariation.GALLON);
        boolean equal = gallon.equals(gallon);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenNullForGallon_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitVariation.GALLON);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void whenGivenGallonType_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit gallon = new Unit(2.0, UnitVariation.GALLON);
        Assert.assertEquals(gallon,new Unit(2.0, UnitVariation.GALLON));
    }
    @Test
    public void whenGivenTwoLitreValue_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit litre = new Unit(0.0, UnitVariation.LITRE);
        Assert.assertEquals(litre,new Unit(0.0, UnitVariation.LITRE));
    }
    @Test
    public void whenGivenLitreValue_CheckForReference() throws QuantityMeasurementException {
        Unit litre = new Unit(0.0, UnitVariation.LITRE);
        boolean equal = litre.equals(litre);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenNullForLitre_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitVariation.LITRE);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void whenGivenLitreType_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit litre = new Unit(2.0, UnitVariation.LITRE);
        Assert.assertEquals(litre,new Unit(2.0, UnitVariation.LITRE));
    }
    @Test
    public void givenGallonAndLitre_ShouldReturnTrue() throws QuantityMeasurementException {
        Unit gallon = new Unit(1.0, UnitVariation.GALLON);
        Unit litre = new Unit(3.78, UnitVariation.LITRE);
        Assert.assertTrue(quantityMeasurement.compare(gallon, litre));
    }
    @Test
    public void givenLitreMililitre_ShouldReturnTrue() throws QuantityMeasurementException {
        Unit millilitre = new Unit(1000.0, UnitVariation.MILLILITRE);
        Unit litre = new Unit(1.0, UnitVariation.LITRE);
        Assert.assertTrue(quantityMeasurement.compare(millilitre, litre));
    }
    @Test
    public void whenGallonAndLitreAdded_ShouldReturnLitre() throws QuantityMeasurementException {
        Unit gallon = new Unit(1.0, UnitVariation.GALLON);
        Unit litre = new Unit(3.78, UnitVariation.LITRE);
        Assert.assertEquals(quantityMeasurement.add(litre, gallon), 7.56, 0.00);
    }
    @Test
    public void whenLitreAndMlAdded_ShouldReturnLitre() throws QuantityMeasurementException {
        Unit ml = new Unit(1000.0, UnitVariation.MILLILITRE);
        Unit litre = new Unit(1.0, UnitVariation.LITRE);
        Assert.assertEquals(quantityMeasurement.add(litre, ml), 2, 0.00);
    }
    @Test
    public void whenGivenTwoKgValue_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit kg = new Unit(0.0, UnitVariation.KILOGRAM);
        Assert.assertEquals(kg,new Unit(0.0, UnitVariation.KILOGRAM));
    }
    @Test
    public void whenGivenKgValue_CheckForReference() throws QuantityMeasurementException {
        Unit kg = new Unit(0.0, UnitVariation.KILOGRAM);
        boolean equal = kg.equals(kg);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenNullForKg_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitVariation.KILOGRAM);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void whenGivenTwoGramValue_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit gram = new Unit(0.0, UnitVariation.GRAM);
        Assert.assertEquals(gram,new Unit(0.0, UnitVariation.GRAM));
    }
    @Test
    public void whenGivenGramValue_CheckForReference() throws QuantityMeasurementException {
        Unit gram = new Unit(0.0, UnitVariation.GRAM);
        boolean equal = gram.equals(gram);
        Assert.assertEquals(true,equal);
    }
    @Test
    public void whenNullForGram_ShouldCheck(){
        try {
            double result = quantityMeasurement.converter(null, UnitVariation.GRAM);
        }catch(QuantityMeasurementException e){
            System.out.println(e.getMessage());;
        }
    }
    @Test
    public void whenGivenGramType_ifEqual_shouldReturnTrue() throws QuantityMeasurementException {
        Unit gram = new Unit(2.0, UnitVariation.GRAM);
        Assert.assertEquals(gram,new Unit(2.0, UnitVariation.GRAM));
    }
    @Test
    public void givenKg_ShouldReturnGram() throws QuantityMeasurementException {
        Unit kilogram = new Unit(1.0, UnitVariation.KILOGRAM);
        Unit grams = new Unit(1000.0, UnitVariation.GRAM);
        Assert.assertTrue(quantityMeasurement.compare(grams, kilogram));
    }
    @Test
    public void givenTonne_ShouldReturnKg() throws QuantityMeasurementException {
        Unit tonne = new Unit(1.0, UnitVariation.TONNE);
        Unit kilogram = new Unit(1000.0, UnitVariation.KILOGRAM);
        Assert.assertTrue(quantityMeasurement.compare(tonne, kilogram));
    }
    @Test
    public void whenTonneAndGramAdded_ShouldReturnKg() throws QuantityMeasurementException {
        Unit tonne = new Unit(1.0, UnitVariation.TONNE);
        Unit gram = new Unit(1000.0, UnitVariation.GRAM);
        Assert.assertEquals(1001.0, quantityMeasurement.add(tonne, gram), 0.0);
    }
    @Test
    public void GivenFarenheit_ShouldReturnCelsius() {
        double result = quantityMeasurement.convertFarenheightToCelsius(212.0);
        Assert.assertEquals(100.0,result,0.0);
    }
    @Test
    public void givenValues_WhenNegative_ShouldThrowAnException() throws QuantityMeasurementException {
        Unit gram = new Unit(-10.0, UnitVariation.GRAM);
        Unit kilogram = new Unit(100.0, UnitVariation.KILOGRAM);
        try {
            quantityMeasurement.compare(gram, kilogram);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }
}
