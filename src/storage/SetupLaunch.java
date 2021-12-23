package storage;

public class SetupLaunch {
    final static boolean invalidGrades = false;
    final static boolean emptyLessons = false;
    final static boolean emptyGroup = false;
    final static boolean emptyFaculty = false;
    final static boolean emptyUniversity = false;

    public static boolean isInvalidGrades() {
        return invalidGrades;
    }

    public static boolean isEmptyLessons() {
        return emptyLessons;
    }

    public static boolean isEmptyGroup() {
        return emptyGroup;
    }

    public static boolean isEmptyFaculty() {
        return emptyFaculty;
    }

    public static boolean isEmptyUniversity() {
        return emptyUniversity;
    }
}
