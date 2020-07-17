package quantitymeasurement.service;

import quantitymeasurement.exception.QuantityMeasurementException;
import quantitymeasurement.model.Unit;
import quantitymeasurement.utility.UnitVariation;

public class QuantityMeasurement {
    public double converter(Double value, UnitVariation unitVariation) throws QuantityMeasurementException {
        if (value == null) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value given");
        }
        if (unitVariation.equals(UnitVariation.FAHRENHEIT))
            return (value - unitVariation.baseUnitConversion) * 5/9 ;
        return value * unitVariation.baseUnitConversion;
    }

    public double add(Unit value1, Unit value2) throws QuantityMeasurementException {
        if (value1.value < 0.0 || value2.value < 0.0)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE,
                    "provided negative values");
        if (value1.unitVariation.type.equals(value2.unitVariation.type))
            return converter(value1.value, value1.unitVariation) + converter(value2.value, value2.unitVariation);
        throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.TYPE_MISMATCH,
                "Different Unit types Provided");
    }

    public boolean compare(Unit value1, Unit value2) throws QuantityMeasurementException {
        if (value1.value < 0.0 || value2.value < 0.0)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE,
                    "provided negative values");
        if (value1.unitVariation.type.equals(value2.unitVariation.type))
            return (Double.compare(converter(value1.value, value1.unitVariation)
                    , converter(value2.value, value2.unitVariation)) == 0);
        throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.TYPE_MISMATCH,
                "Different Unit types Provided");
    }
}
