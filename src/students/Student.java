package students;

import storage.Storage;

import java.util.Map;

public class Student {
    Storage storage = new Storage();

    String studentName;
    String studentFaculty;
    Map<String, Integer> studentLessons;


    public Student() {
        studentName = generateName();
    }

    private String generateName() {
        int randomFirstNameIndex = (int) (Math.floor(Math.random() * (storage.getFirstNameArray().length)) + 0);
        String firstName = storage.getFirstNameArray()[randomFirstNameIndex];
        int randomLastNameIndex = (int) (Math.floor(Math.random() * (storage.getLastNameArray().length)) + 0);
        String lastName = storage.getLastNameArray()[randomLastNameIndex];

        return firstName + "_" + lastName;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public Map<String, Integer> getStudentLessons() {
        return studentLessons;
    }

    public void setStudentLessons(Map<String, Integer> studentLessons) {
        this.studentLessons = studentLessons;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentFaculty='" + studentFaculty + '\'' +
                ", studentLessons=" + studentLessons +
                '}';
    }
}