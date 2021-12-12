package faculty;

import storage.Storage;
import students.Student;
import university.University;

import java.util.*;

public class FacultyActions extends University {
    Storage storage = new Storage();

    public List<Student> studentsByFaculty (String faculty) {
        List<Student> groupStudent = new ArrayList<>();
        for (int i = 0; i < allUniversityStudents.size(); i++) {
            if (allUniversityStudents.get(i).getStudentFaculty() == null) {

                allUniversityStudents.get(i).setStudentFaculty(faculty);

                Map<String, Integer> studentLessonsAndGrades = new HashMap<>();

                allUniversityStudents.get(i).setStudentLessons(studentLessonsAndGrades);

                groupStudent.add(allUniversityStudents.get(i));
            }
        }
        return groupStudent;
    }

    public List<Student> enrollmentAcademicSubjectsToTheStudent(List<Student> groupStudents) {
        for (int i = 0; i < groupStudents.size(); i++) {
            if (Objects.equals(groupStudents.get(i).getStudentFaculty(), "Art_Faculty")) {
                groupStudents.get(i).setStudentLessons(generateLessonsForStudent(storage.getArtFacultyAcademicSubjects()));
            } else if (Objects.equals(groupStudents.get(i).getStudentFaculty(), "Faculty_Of_ScreenArts")) {
                groupStudents.get(i).setStudentLessons(generateLessonsForStudent(storage.getFacultyOfScreenArtsAcademicSubjects()));
            } else if (Objects.equals(groupStudents.get(i).getStudentFaculty(), "Theatre_Faculty")) {
                groupStudents.get(i).setStudentLessons(generateLessonsForStudent(storage.getTheatreFacultyAcademicSubjects()));
            }
        }
        return groupStudents;
    }

    private Map<String, Integer> generateLessonsForStudent(String[] facultyLessons) {
        Map<String, Integer> studentLessons = new HashMap<>();

        int countLessons = generateRandomInteger(0, 4);

        for (int i = 0; i < countLessons; i++) {
            studentLessons.put(facultyLessons[i], generateRandomInteger(-1, 11));
        }
        return studentLessons;
    }

    private int generateRandomInteger(int minInt, int maxInt) {
        return (int) (Math.floor(Math.random() * (maxInt - minInt + 1)) + minInt);
    }
}
