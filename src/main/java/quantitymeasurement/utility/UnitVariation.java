package quantitymeasurement.utility;

public enum UnitVariation {
    INCH(1.0,Type.LENGTH), FEET(12.0,Type.LENGTH), YARD(36.0,Type.LENGTH), CM(0.4,Type.LENGTH)
    , GALLON(3.78,Type.VOLUME), LITRE(1.0,Type.VOLUME), MILLILITRE(0.001,Type.VOLUME), GRAM(0.001,Type.WEIGHT)
    , KILOGRAM(1.0,Type.WEIGHT), TONNE(1000,Type.WEIGHT),CELSIUS(1,Type.TEMPERATURE),FAHRENHEIT(32,Type.TEMPERATURE);
    public double baseUnitConversion;
    public Type type;
    UnitVariation(double baseUnitConversion,Type type) {
        this.baseUnitConversion = baseUnitConversion;
        this.type = type;
    }
}
