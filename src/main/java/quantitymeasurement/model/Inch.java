package quantitymeasurement.model;

public class Inch {
    double inch;
    public Inch(Double inch) {
        this.inch = inch;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inch)) return false;
        Inch inch1 = (Inch) o;
        return Double.compare(inch1.inch, inch) == 0;
    }
}
