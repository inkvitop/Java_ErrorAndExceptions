package exceptions;

public class ScoreOutOfBoundsExceptionException extends Exception {
    public ScoreOutOfBoundsExceptionException() {
    }

    public ScoreOutOfBoundsExceptionException(String message) {
        super(message);
    }

    public ScoreOutOfBoundsExceptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScoreOutOfBoundsExceptionException(Throwable cause) {
        super(cause);
    }

    public ScoreOutOfBoundsExceptionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
