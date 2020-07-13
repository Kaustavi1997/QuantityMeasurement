package quantitymeasurement.service;

public class QuantityMeasurement {
    private final int FEET_TO_INCH_CONVERTER = 12;
    public double feetToInch(double feet) {
        return feet*FEET_TO_INCH_CONVERTER;
    }
    public double feet(double feet){
        return feet;
    }
}
