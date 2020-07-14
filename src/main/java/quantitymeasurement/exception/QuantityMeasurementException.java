package quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public ExceptionType exceptionType;
    public enum ExceptionType{
        NULL_VALUE
    }
    public QuantityMeasurementException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
