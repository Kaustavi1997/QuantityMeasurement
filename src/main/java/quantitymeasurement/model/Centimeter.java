package quantitymeasurement.model;

public class Centimeter {
    double centimeter;
    public Centimeter(double centimeter){
        this.centimeter = centimeter;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Centimeter)) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(that.centimeter, centimeter) == 0;
    }

}
