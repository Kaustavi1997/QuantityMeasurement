package quantitymeasurement.service;

public class QuantityMeasurement {
    private final int FEET_TO_INCH_CONVERTER = 12;
    private final double FEET_TO_YARD_CONVERTER = 0.33;
    private final double INCH_TO_YARD_CONVERTER = 0.027;
    private final double YARD_TO_INCH_CONVERTER = 36;
    private final double YARD_TO_FEET_CONVERTER = 3;
    public double feetToInch(double feet) {
        return feet*FEET_TO_INCH_CONVERTER;
    }
    public double InchToFeet(double inch) {
        return inch/FEET_TO_INCH_CONVERTER;
    }
    public double feetToYard(double feet) {
        return feet*FEET_TO_YARD_CONVERTER;
    }
    public double inchToYard(double inch){
        return inch*INCH_TO_YARD_CONVERTER;
    }
    public double yardToInch(double yard){
        return yard*YARD_TO_INCH_CONVERTER;
    }
    public double yardToFeet(double yard){
        return yard*YARD_TO_FEET_CONVERTER;
    }
}
