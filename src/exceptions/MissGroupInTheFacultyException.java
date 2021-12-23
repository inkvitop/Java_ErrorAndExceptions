package exceptions;

public class MissGroupInTheFacultyException extends Exception {
    public MissGroupInTheFacultyException() {
    }

    public MissGroupInTheFacultyException(String message) {
        super(message);
    }

    public MissGroupInTheFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissGroupInTheFacultyException(Throwable cause) {
        super(cause);
    }

    public MissGroupInTheFacultyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
