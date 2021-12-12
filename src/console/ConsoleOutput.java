package console;

import university.UniversityActions;

public class ConsoleOutput {
    UniversityActions universityActions = new UniversityActions();

    public void instruction() {
        System.out.println("Welcome to the program which will help to inspect the university.");
        System.out.println("Here is a list of commands to help you do this:");
        System.out.println("******************************************");
        System.out.println("-get_average_student_score or -1    ()");
        System.out.println("-get_average_subject_score or -3    (Get a GPA in a subject across the university)");
        System.out.println("-help                               (List of all available commands)");
        System.out.println("-exit                               (End the program)");
        System.out.println("******************************************");
    }

    public void help() {
        System.out.println("******************************************");
        System.out.println("-students                   ()");
        System.out.println("-student <student name>     ()");
        System.out.println("-fuelSort               (Sort all cars in the taxi fleet by fuel consumption)");
        System.out.println("-speed <int> <int>      (Get all cars whose maximum speed is within the specified range)");
        System.out.println("-help                   (List of all available commands)");
        System.out.println("-exit                   (End the program)");
        System.out.println("******************************************");
    }

    public void printAllStudentsName() {
        universityActions.printAllStudentsName();
    }

    public void studentInstructions() {
        System.out.println("******************************************");
        System.out.println("Enter the command:");
        System.out.println("-student");
        System.out.println("and the student's name to get the GPA in all of his academic subjects.");
        System.out.println("******************************************");
    }

    public void inputError() {
        System.out.println("ERROR");
    }

    public void exit() {
        System.out.println("EXIT");
    }

}
