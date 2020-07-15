package quantitymeasurement.model;

public class Temperature {
    public enum Unit{ FAHRENHEIT,CELSIUS };
    private final Temperature.Unit unit;
    private final double value;
    public Temperature(double value, Temperature.Unit unit) {
        this.unit = unit ;
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature temperature = (Temperature) o;
        return Double.compare(temperature.value, value) == 0 && unit == temperature.unit;
    }
}
