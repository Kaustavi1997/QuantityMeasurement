package quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public ExceptionType exceptionType;
    public enum ExceptionType{
        NULL_VALUE
    }
    public QuantityMeasurementException(ExceptionType e, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
