package faculty;

import students.Student;

import java.util.List;

public class TheatreFaculty {
    FacultyActions facultyActions = new FacultyActions();

    List<Student> groupA;
    List<Student> groupB;

    public TheatreFaculty() {
        groupA = facultyActions.studentsByFaculty("Theatre_Faculty");
        groupB = facultyActions.studentsByFaculty("Theatre_Faculty");
        groupA = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupA);
        groupB = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupB);
    }
}
