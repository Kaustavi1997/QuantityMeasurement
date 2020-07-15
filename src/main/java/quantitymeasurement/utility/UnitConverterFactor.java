package quantitymeasurement.utility;

public enum UnitConverterFactor {
    FEET_TO_INCH(12),FEET_TO_YARD(0.33),INCH_TO_YARD(0.027),YARD_TO_INCH(36),YARD_TO_FEET(3)
    ,INCH_TO_FEET(0.083),INCH_TO_CM(2.5),CM_TO_INCH(.39),GALLON_TO_LITER(3.78)
    ,LITRE_TO_ML(1000),ML_TO_LITRE(.001),KG_TO_GR(1000);
    public double value;
    UnitConverterFactor(double value){
        this.value = value;
    }
}

