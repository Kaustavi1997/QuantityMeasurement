package quantitymeasurement.service;

import quantitymeasurement.utility.UnitConverterFactor;

public class QuantityMeasurement {
    public double converter(double value, UnitConverterFactor unitConverterFactor){
        return value * unitConverterFactor.value;
    }
}
