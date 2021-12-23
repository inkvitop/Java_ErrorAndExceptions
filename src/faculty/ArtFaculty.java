package faculty;

import exceptions.MissFacultyInTheUniversityException;
import student.Student;

import java.util.List;

public class ArtFaculty {
    FacultyActions facultyActions = new FacultyActions();

    List<Student> groupA;
    List<Student> groupB;

    public ArtFaculty() {
        try {
            groupA = facultyActions.studentsByFaculty("Art_Faculty", "A");
        } catch (MissFacultyInTheUniversityException e) {
            e.printStackTrace();
        }
        try {
            groupB = facultyActions.studentsByFaculty("Art_Faculty", "B");
        } catch (MissFacultyInTheUniversityException e) {
            e.printStackTrace();
        }
        groupA = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupA);
        groupB = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupB);
    }
}
