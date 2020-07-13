package quantitymeasurement.model;

public class Feet {
    double feet;

    public Feet(double feet){
        this.feet = feet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feet)) return false;
        Feet feet1 = (Feet) o;
        return Double.compare(feet1.feet, feet) == 0;
    }
}
