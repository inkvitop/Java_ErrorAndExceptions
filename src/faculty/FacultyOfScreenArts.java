package faculty;

import exceptions.MissFacultyInTheUniversityException;
import student.Student;

import java.util.List;

public class FacultyOfScreenArts {
    FacultyActions facultyActions = new FacultyActions();

    List<Student> groupA;
    List<Student> groupB;

    public FacultyOfScreenArts() {
        try {
            groupA = facultyActions.studentsByFaculty("Faculty_Of_ScreenArts", "A");
        } catch (MissFacultyInTheUniversityException e) {
            e.printStackTrace();
        }
        try {
            groupB = facultyActions.studentsByFaculty("Faculty_Of_ScreenArts", "B");
        } catch (MissFacultyInTheUniversityException e) {
            e.printStackTrace();
        }
        groupA = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupA);
        groupB = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupB);
    }
}
