package university;

import console.ConsoleOutput;
import exceptions.MissAcademicSubjectsException;
import exceptions.ScoreOutOfBoundsExceptionException;
import storage.Storage;
import student.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class UniversityActions {
    ConsoleOutput consoleOutput = new ConsoleOutput();

    public static List<Student> universityRecruitment() {
        Storage storage = new Storage();
        List<Student> groupStudents = new ArrayList<>();
        int studentsCount = storage.getUniversityFaculties().length * 2 * 10;
        for (int i = 0; i < studentsCount; i++) {
            groupStudents.add(new Student());
        }
        return groupStudents;
    }

    public void getStudentAverageScore(String studentName) throws MissAcademicSubjectsException {
        int averageScore = 0;
        for (int i = 0; i < Storage.getAllUniversityStudents().size(); i++) {
            if (Objects.equals(Storage.getAllUniversityStudents().get(i).getStudentName(), studentName)) {
                Collection<Integer> averageScoreArray = Storage.getAllUniversityStudents().get(i).getStudentLessons().values();
                averageScoreArray.stream().mapToInt(v -> v).forEach(value -> {
                    if (value > 10 || value < 0) {
                        try {
                            throw new ScoreOutOfBoundsExceptionException("The student has an invalid grade");
                        } catch (ScoreOutOfBoundsExceptionException e) {
                            e.printStackTrace();
                        }
                    }
                });
                averageScore += averageScoreArray.stream().mapToInt(v -> v).sum();
                if (averageScoreArray.size() == 0) {
                    throw new MissAcademicSubjectsException("The student has no academic subject");
                } else {
                    averageScore = averageScore / averageScoreArray.size();
                }
            }
        }
        consoleOutput.printStudentAverageScore(studentName, averageScore);
    }

    public void getUniversityLessonsAverageScore(String subject) throws MissAcademicSubjectsException {
        int averageScore = 0;
        int countStudents = 0;

        for (int i = 0; i < Storage.getAllUniversityStudents().size(); i++) {
            if (Storage.getAllUniversityStudents().get(i).getStudentLessons().size() == 0) {
                throw new MissAcademicSubjectsException("The student has no academic subject");
            } else {
                int studentSubjectScore = Storage.getAllUniversityStudents().get(i).getStudentLessons().getOrDefault(subject, -99);

                if (studentSubjectScore != -99) {
                    if (studentSubjectScore < 0 || studentSubjectScore > 10) {
                        try {
                            throw new ScoreOutOfBoundsExceptionException("The student has an invalid grade");
                        } catch (ScoreOutOfBoundsExceptionException e) {
                            e.printStackTrace();
                        }
                    }
                    averageScore += studentSubjectScore;
                    countStudents++;
                }
            }
        }
        averageScore = averageScore / countStudents;
        consoleOutput.printUniversitySubjectAverageScore(subject, averageScore);
    }
}
