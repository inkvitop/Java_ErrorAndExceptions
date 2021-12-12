package university;

import storage.Storage;
import students.Student;

import java.util.ArrayList;
import java.util.List;

public class UniversityActions extends University {
    public static List<Student> universityRecruitment() {
        Storage storage = new Storage();
        List<Student> groupStudents = new ArrayList<>();

        int studentsCount = storage.getUniversityFaculties().length * 2 * 10;

        for (int i = 0; i < studentsCount; i++) {
            groupStudents.add(new Student());
        }
        return groupStudents;
    }

    public void getStudentAverageScore(String studentName) {

    }

    public void printAllStudentsName() {
        allUniversityStudents.forEach(s -> System.out.println(s));
    }
}
