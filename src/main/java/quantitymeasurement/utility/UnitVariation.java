package quantitymeasurement.utility;

public enum UnitVariation {
    INCH(1.0), FEET(12.0), YARD(36.0), CM(0.4)
    , GALLON(3.78), LITRE(1.0), MILLILITRE(0.001), GRAM(0.001)
    , KILOGRAM(1.0), TONNE(1000);
    public double baseUnitConversion;
    UnitVariation(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }
}
