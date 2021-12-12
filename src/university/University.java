package university;

import students.Student;

import java.util.List;

public class University {
    public List<Student> allUniversityStudents;

    public University() {
        allUniversityStudents = UniversityActions.universityRecruitment();
    }
}
