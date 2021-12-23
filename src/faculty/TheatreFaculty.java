package faculty;

import exceptions.MissFacultyInTheUniversityException;
import student.Student;

import java.util.List;

public class TheatreFaculty {
    FacultyActions facultyActions = new FacultyActions();

    List<Student> groupA;
    List<Student> groupB;

    public TheatreFaculty() {
        try {
            groupA = facultyActions.studentsByFaculty("Theatre_Faculty", "A");
        } catch (MissFacultyInTheUniversityException e) {
            e.printStackTrace();
        }
        try {
            groupB = facultyActions.studentsByFaculty("Theatre_Faculty", "B");
        } catch (MissFacultyInTheUniversityException e) {
            e.printStackTrace();
        }
        groupA = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupA);
        groupB = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupB);
    }
}