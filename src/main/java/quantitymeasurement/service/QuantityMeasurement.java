package quantitymeasurement.service;

import quantitymeasurement.exception.QuantityMeasurementException;
import quantitymeasurement.model.Unit;
import quantitymeasurement.utility.UnitVariation;

public class QuantityMeasurement {
    public double converter(Double value, UnitVariation unitVariation) throws QuantityMeasurementException {
        if(value == null){
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE,"Null value given");
        }
        return value * unitVariation.baseUnitConversion; }
    public double add(Unit value1, Unit value2) throws QuantityMeasurementException {
        if(value1.value < 0.0 || value2.value < 0.0 )
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE,
                        "provided negetive values");
        return converter(value1.value, value1.unitVariation)
                    + converter(value2.value, value2.unitVariation) ;
    }
    public boolean compare(Unit value1, Unit value2) throws QuantityMeasurementException {
        if(value1.value < 0.0 || value2.value < 0.0 )
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE,
                    "provided negetive values");
        return (Double.compare(converter(value1.value, value1.unitVariation),converter(value2.value, value2.unitVariation)) == 0);

    }
    public double convertFarenheightToCelsius(double value){
        return (value - 32)*5/9;
    }
}
