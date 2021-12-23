package exceptions;

public class MissAcademicSubjectsException extends Exception {
    public MissAcademicSubjectsException() {
    }

    public MissAcademicSubjectsException(String message) {
        super(message);
    }

    public MissAcademicSubjectsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissAcademicSubjectsException(Throwable cause) {
        super(cause);
    }

    public MissAcademicSubjectsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
