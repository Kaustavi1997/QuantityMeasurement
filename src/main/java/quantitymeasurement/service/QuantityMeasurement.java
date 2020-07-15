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
    public double add(Double value1,Double value2){
        return value1+value2;
    }
    public double convertFarenheightToCelsius(double value){
        return (value - 32)*5/9;
    }
}
