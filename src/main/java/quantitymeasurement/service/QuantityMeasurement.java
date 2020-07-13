package quantitymeasurement.service;

public class QuantityMeasurement {
    private final int FEET_TO_INCH_CONVERTER = 12;
    private final double FEET_TO_YARD_CONVERTER = 0.33;
    public double feetToInch(double feet) {
        return feet*FEET_TO_INCH_CONVERTER;
    }
    public double InchToFeet(double inch) {
        return inch/FEET_TO_INCH_CONVERTER;
    }
    public double feetToYard(double feet) {
        return feet*FEET_TO_YARD_CONVERTER;
    }

}
