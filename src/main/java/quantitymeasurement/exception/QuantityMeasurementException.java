package quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public ExceptionType exceptionType;
    public enum ExceptionType{

    }
    public QuantityMeasurementException(ExceptionType e, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
