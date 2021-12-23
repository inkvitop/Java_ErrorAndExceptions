package faculty;

import exceptions.MissFacultyInTheUniversityException;
import exceptions.MissStudentsInTheGroupException;
import exceptions.ScoreOutOfBoundsExceptionException;
import storage.SetupLaunch;
import storage.Storage;
import student.Student;

import java.util.*;

public class FacultyActions {
    public List<Student> studentsByFaculty (String faculty, String group) throws MissFacultyInTheUniversityException {
        List<Student> groupStudent = new ArrayList<>();
        if (!SetupLaunch.isEmptyFaculty()) {
            int count = 0;

            for (int i = 0; i < Storage.getAllUniversityStudents().size(); i++) {
                if (count != 10) {
                    if (Storage.getAllUniversityStudents().get(i).getStudentFaculty() == null) {
                        Storage.getAllUniversityStudents().get(i).setStudentFaculty(faculty);

                        if (!SetupLaunch.isEmptyGroup()) {
                            Storage.getAllUniversityStudents().get(i).setStudentGroup(group);
                        }

                        Map<String, Integer> studentLessonsAndGrades = new HashMap<>();
                        Storage.getAllUniversityStudents().get(i).setStudentLessons(studentLessonsAndGrades);
                        groupStudent.add(Storage.getAllUniversityStudents().get(i));

                        count++;
                    }
                } else break;
            }
        } else {
            throw new MissFacultyInTheUniversityException("There are no groups at the faculty");
        }
        return groupStudent;
    }

    public List<Student> enrollmentAcademicSubjectsToTheStudent(List<Student> groupStudents) {
        for (int i = 0; i < groupStudents.size(); i++) {
            if (Objects.equals(groupStudents.get(i).getStudentFaculty(), "Art_Faculty")) {
                groupStudents.get(i).setStudentLessons(generateLessonsForStudent(Storage.getArtFacultyAcademicSubjects()));
            } else if (Objects.equals(groupStudents.get(i).getStudentFaculty(), "Faculty_Of_ScreenArts")) {
                groupStudents.get(i).setStudentLessons(generateLessonsForStudent(Storage.getFacultyOfScreenArtsAcademicSubjects()));
            } else if (Objects.equals(groupStudents.get(i).getStudentFaculty(), "Theatre_Faculty")) {
                groupStudents.get(i).setStudentLessons(generateLessonsForStudent(Storage.getTheatreFacultyAcademicSubjects()));
            }
        }
        return groupStudents;
    }

    private Map<String, Integer> generateLessonsForStudent(String[] facultyLessons) {
        Map<String, Integer> studentLessons = new HashMap<>();
        int countLessons;

        if (SetupLaunch.isEmptyLessons()) {
            countLessons = generateRandomInteger(0, 4);
        } else {
            countLessons = generateRandomInteger(1, 4);
        }

        for (int i = 0; i < countLessons; i++) {
            if (SetupLaunch.isInvalidGrades()) {
                studentLessons.put(facultyLessons[i], generateRandomInteger(-1, 11));
            } else {
                studentLessons.put(facultyLessons[i], generateRandomInteger(0, 10));
            }
        }

        return studentLessons;
    }

    private int generateRandomInteger(int minInt, int maxInt) {
        return (int) (Math.floor(Math.random() * (maxInt - minInt + 1)) + minInt);
    }

    public List<Student> createFacultyStudentsList(String faculty) {
        List<Student> facultyStudentsList = new ArrayList<>();
        for (int i = 0; i < Storage.getAllUniversityStudents().size(); i++) {
            if (Objects.equals(Storage.getAllUniversityStudents().get(i).getStudentFaculty(), faculty)) {
                facultyStudentsList.add(Storage.getAllUniversityStudents().get(i));
            }
        }
        return facultyStudentsList;
    }

    public List<Student> createFacultyGroupStudentsList(List<Student> facultyStudentsList, String group) throws MissStudentsInTheGroupException {
        List<Student> facultyGroupStudentsList = new ArrayList<>();
        for (int i = 0; i < facultyStudentsList.size(); i++) {
            if (Objects.equals(facultyStudentsList.get(i).getStudentGroup(), group)) {
                facultyGroupStudentsList.add(facultyStudentsList.get(i));
            }
        }

        if (facultyGroupStudentsList.size() == 0) {
            throw new MissStudentsInTheGroupException("There are no students in the group");
        } else {
            return facultyGroupStudentsList;
        }
    }

    public int getAverageScore(List<Student> facultyGroupStudent, String subject) throws ScoreOutOfBoundsExceptionException {
        int averageScore = 0;

        for (int i = 0; i < facultyGroupStudent.size(); i++) {

            if (facultyGroupStudent.get(i).getStudentLessons().containsKey(subject)) {
                if (facultyGroupStudent.get(i).getStudentLessons().get(subject) > 10 || facultyGroupStudent.get(i).getStudentLessons().get(subject) < 0) {
                    throw new ScoreOutOfBoundsExceptionException("The student has an invalid grade");
                } else {
                    averageScore += facultyGroupStudent.get(i).getStudentLessons().get(subject);
                }
            }
        }
        return averageScore / facultyGroupStudent.size();
    }
}
