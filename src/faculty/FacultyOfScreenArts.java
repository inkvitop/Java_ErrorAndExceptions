package faculty;

import students.Student;

import java.util.List;

public class FacultyOfScreenArts {
    FacultyActions facultyActions = new FacultyActions();

    List<Student> groupA;
    List<Student> groupB;

    public FacultyOfScreenArts() {
        groupA = facultyActions.studentsByFaculty("Faculty_Of_ScreenArts");
        groupB = facultyActions.studentsByFaculty("Faculty_Of_ScreenArts");
        groupA = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupA);
        groupB = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupB);
    }
}
