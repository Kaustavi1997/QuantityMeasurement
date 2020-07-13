package quantitymeasurement.utility;

public enum UnitConverterFactor {
    FEET_TO_INCH(12),FEET_TO_YARD(0.33),INCH_TO_YARD(0.027),YARD_TO_INCH(36),YARD_TO_FEET(3),INCH_TO_FEET(0.083);
    public double value;
    UnitConverterFactor(double value){
        this.value = value;
    }
}
