package quantitymeasurement.model;

public class Length {
    public enum Unit{ FEET, INCH, CENTIMETER};
    private final Unit unit;
    private final double value;
    public Length(double value,Unit unit) {
        this.unit = unit ;
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0
                && unit == length.unit;
    }
}
