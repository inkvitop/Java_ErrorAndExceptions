package exceptions;

public class MissStudentsInTheGroupException extends Exception {
    public MissStudentsInTheGroupException() {
    }

    public MissStudentsInTheGroupException(String message) {
        super(message);
    }

    public MissStudentsInTheGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissStudentsInTheGroupException(Throwable cause) {
        super(cause);
    }

    public MissStudentsInTheGroupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
