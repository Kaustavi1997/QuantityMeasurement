package quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public ExceptionType exceptionType;
    public enum ExceptionType{
        NULL_VALUE,NEGATIVE
    }
    public QuantityMeasurementException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
