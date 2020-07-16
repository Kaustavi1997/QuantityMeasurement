package quantitymeasurement.model;

import quantitymeasurement.exception.QuantityMeasurementException;
import quantitymeasurement.utility.UnitVariation;

public class Unit {
    public double value;
    public UnitVariation unitVariation;
    public Unit(Double value, UnitVariation unitVariation) throws QuantityMeasurementException {
        this.value = value;
        this.unitVariation = unitVariation;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit)) return false;
        Unit unit = (Unit) o;
        return Double.compare(unit.value, value) == 0 && unitVariation == unit.unitVariation;
    }
}
