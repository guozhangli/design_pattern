package CountDownLatch;

public class WaitTimeOutException extends Exception {
    public WaitTimeOutException(String message) {
        super(message);
    }
}
