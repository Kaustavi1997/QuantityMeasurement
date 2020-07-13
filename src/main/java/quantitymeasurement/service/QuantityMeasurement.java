package quantitymeasurement.service;

public class QuantityMeasurement {
    private final int FEET_TO_INCH_CONVERTER = 12;
    public double feetToInch(double feet) {
        return feet*FEET_TO_INCH_CONVERTER;
    }
    public double InchToFeet(double inch) {
        return inch/FEET_TO_INCH_CONVERTER;
    }

}
