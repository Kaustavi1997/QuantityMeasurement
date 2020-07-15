package quantitymeasurement.model;

public class Weight {
    public enum Unit{ KG };
    private final Weight.Unit unit;
    private final double value;
    public Weight(double value, Weight.Unit unit) {
        this.unit = unit ;
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 && unit == weight.unit;
    }
}
