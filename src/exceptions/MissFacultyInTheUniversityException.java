package exceptions;

public class MissFacultyInTheUniversityException extends Exception {
    public MissFacultyInTheUniversityException() {
    }

    public MissFacultyInTheUniversityException(String message) {
        super(message);
    }

    public MissFacultyInTheUniversityException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissFacultyInTheUniversityException(Throwable cause) {
        super(cause);
    }

    public MissFacultyInTheUniversityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
