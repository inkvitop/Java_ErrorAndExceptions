package faculty;

import students.Student;

import java.util.List;

public class ArtFaculty {
    FacultyActions facultyActions = new FacultyActions();

    List<Student> groupA;
    List<Student> groupB;

    public ArtFaculty() {
        groupA = facultyActions.studentsByFaculty("Art_Faculty");
        groupB = facultyActions.studentsByFaculty("Art_Faculty");
        groupA = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupA);
        groupB = facultyActions.enrollmentAcademicSubjectsToTheStudent(groupB);
    }
}
