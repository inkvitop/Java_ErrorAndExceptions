package console;

import storage.Storage;

import java.util.Arrays;
import java.util.Objects;

public class ConsoleOutput {
    public void printGreetings() {
        System.out.println("******************************************");
        System.out.println("Welcome to the program which will help to inspect the university.");
        System.out.println("Here is a list of commands to help you do this:");
        System.out.println("******************************************");
    }
    public void printInstruction() {
        System.out.println("******************************************");
        System.out.println("-get_average_student_score or -1        (Get a GPA in all of a student's subjects)");
        System.out.println("-get_average_group_subject_score or -2  (Get a GPA in a selected subject in a selected group)");
        System.out.println("-get_average_subject_score or -3        (Get a GPA in a subject across the university)");
        System.out.println("-help                                   (List of all available commands)");
        System.out.println("-exit                                   (End the program)");
        System.out.println("******************************************");
    }

    public void printStudentInstructions() {
        System.out.println("******************************************");
        System.out.println("Enter the command:");
        System.out.println("-student");
        System.out.println("and the student's name to get the GPA in all of his academic subjects.");
        System.out.println("******************************************");
    }

    public void printStudentAverageScore(String studentName, int averageScore) {
        System.out.println("******************************************");
        System.out.println(studentName + " student has a grade point average of " + averageScore + "!");
        System.out.println("******************************************");
    }

    public void printUniversitySubjectAverageScore(String subject, int averageScore) {
        System.out.println("******************************************");
        System.out.println("Average score in " + subject + " across the university = " + averageScore + "!");
        System.out.println("******************************************");
    }

    public void printAverageSubjectInstructions() {
        System.out.println("******************************************");
        System.out.println("Enter the command:");
        System.out.println("-subject <subject name>");
        System.out.println("and subject name \n( Calligraphy, Sculpture, Painting, Drawing, Sound_engineering, Video_editing, Light_setting, Movie_history, Literature, Acting skills, Choreography, Philosophy ) \nto get the GPA for that subject across the entire university.");
        System.out.println("******************************************");
    }

    public void printFacultyInstructions() {
        System.out.println("******************************************");
        System.out.println("Enter the command:");
        System.out.println("-faculty <faculty name>");
        System.out.println("(Art_Faculty, Faculty_Of_ScreenArts, Theatre_Faculty)");
        System.out.println("******************************************");
    }

    public void printFacultyGroupInstructions() {
        System.out.println("******************************************");
        System.out.println("Enter the command:");
        System.out.println("-group <group name>");
        System.out.println("(A, B)");
        System.out.println("******************************************");
    }

    public void printFacultyGroupSubjectInstructions(String faculty) {
        System.out.println("******************************************");
        System.out.println("Enter the command:");
        System.out.println("-lessons <subject name>");
        if (Objects.equals(faculty, "Art_Faculty")) {
            System.out.println(Arrays.toString(Storage.getArtFacultyAcademicSubjects()));
        } else if (Objects.equals(faculty, "Faculty_Of_ScreenArts")) {
            System.out.println(Arrays.toString(Storage.getFacultyOfScreenArtsAcademicSubjects()));
        } else if (Objects.equals(faculty, "Theatre_Faculty")) {
            System.out.println(Arrays.toString(Storage.getTheatreFacultyAcademicSubjects()));
        }
        System.out.println("******************************************");
    }

    public void printFacultyGroupSubjectAverageScore(String faculty, String group, String subject, int averageScore) {
        System.out.println("******************************************");
        System.out.println("A GPA for \"" + subject + "\" in group \"" + group + "\" in the \"" + faculty + "\" = " + averageScore);
        System.out.println("******************************************");
    }

    public void printAllStudentsName() {
        System.out.println("******************************************");
        Storage.getAllUniversityStudents().forEach(student -> System.out.println(student.toString()));
        System.out.println("******************************************");
    }

    public void printInputError() {
        System.out.println("******************************************");
        System.out.println("!!! Invalid command entered !!!");
        System.out.println("******************************************");
    }

    public void exit() {
        System.out.println("******************************************");
        System.out.println("Terminating the program...");
        System.out.println("******************************************");
    }
}
