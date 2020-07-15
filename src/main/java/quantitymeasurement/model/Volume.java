package quantitymeasurement.model;

public class Volume {
    public enum Unit{ GALLON,LITRE };
    private final Volume.Unit unit;
    private final double value;
    public Volume(double value, Volume.Unit unit) {
        this.unit = unit ;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }
}
