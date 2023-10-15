package Week4;

public class DriverOverSpeedException extends Exception {
    public DriverOverSpeedException(String message) {
        super(message);
    }

    public DriverOverSpeedException(String message, Throwable cause) {
        super(message, cause);
    }
}
