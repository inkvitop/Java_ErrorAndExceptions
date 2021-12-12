package console;

import university.UniversityActions;

import java.util.Scanner;

public class ConsoleInput {
    ConsoleOutput consoleOutput = new ConsoleOutput();
    UniversityActions universityActions = new UniversityActions();

    public void newInput() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        String[] inputArray = inputString.split(" ");

        switch (inputArray[0]) {
            case ("-help"): {
                consoleOutput.instruction();
                newInput();
                break;
            }
            case ("-1"):
            case ("-get_average_student_score"): {
                consoleOutput.printAllStudentsName();
                consoleOutput.studentInstructions();
                newInput();
                break;
            }
            case ("-student"): {
                universityActions.getStudentAverageScore(inputArray[1]);
                newInput();
                break;
            }
            //            case ("-3"):
            case ("-get_average_subject_score"): {

                newInput();
                break;
            }
            case ("-exit"): {
                consoleOutput.exit();
                break;
            }
            default: {
                consoleOutput.inputError();
                newInput();
            }
        }
    }
}
