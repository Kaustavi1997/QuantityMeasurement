package quantitymeasurement.service;

import quantitymeasurement.exception.QuantityMeasurementException;
import quantitymeasurement.utility.UnitConverterFactor;

public class QuantityMeasurement {
    public double converter(Double value, UnitConverterFactor unitConverterFactor) throws QuantityMeasurementException {
        if(value == null){
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE,"Null value given");

        }
        return value * unitConverterFactor.value;
    }
}
