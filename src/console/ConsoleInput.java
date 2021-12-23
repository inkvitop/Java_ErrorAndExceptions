package console;

import exceptions.MissAcademicSubjectsException;
import exceptions.MissStudentsInTheGroupException;
import exceptions.ScoreOutOfBoundsExceptionException;
import faculty.FacultyActions;
import student.Student;
import university.UniversityActions;

import java.util.List;
import java.util.Scanner;

public class ConsoleInput {
    ConsoleOutput consoleOutput = new ConsoleOutput();
    UniversityActions universityActions = new UniversityActions();
    FacultyActions facultyActions = new FacultyActions();

    List<Student> facultyStudentsList;
    List<Student> facultyGroupStudentsList;
    String tempFaculty;
    String tempGroup;
    int tempAverageScore;

    public void newInput() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        String[] inputArray = inputString.split(" ");

        switch (inputArray[0]) {
            case ("-1"):
            case ("-get_average_student_score"): {
                consoleOutput.printAllStudentsName();
                consoleOutput.printStudentInstructions();
                newInput();
                break;
            }
            case ("-student"): {
                try {
                    universityActions.getStudentAverageScore(inputArray[1]);
                } catch (MissAcademicSubjectsException e) {
                    e.printStackTrace();
                }
                consoleOutput.printInstruction();
                break;
            }
            case ("-2"):
            case ("-get_average_group_subject_score"): {
                consoleOutput.printFacultyInstructions();
                newInput();
                break;
            }
            case ("-faculty"): {
                tempFaculty = inputArray[1];
                facultyStudentsList = facultyActions.createFacultyStudentsList(inputArray[1]);
                consoleOutput.printFacultyGroupInstructions();
                newInput();
                break;
            }
            case ("-group"): {
                try {
                    facultyGroupStudentsList = facultyActions.createFacultyGroupStudentsList(facultyStudentsList, inputArray[1]);
                } catch (MissStudentsInTheGroupException e) {
                    e.printStackTrace();
                }
                tempGroup = inputArray[1];
                consoleOutput.printFacultyGroupSubjectInstructions(tempFaculty);
                newInput();
                break;
            }
            case ("-lessons"): {
                try {
                    tempAverageScore = facultyActions.getAverageScore(facultyGroupStudentsList, inputArray[1]);
                } catch (ScoreOutOfBoundsExceptionException e) {
                    e.printStackTrace();
                }

                consoleOutput.printFacultyGroupSubjectAverageScore(tempFaculty, tempGroup, inputArray[1], tempAverageScore);
                consoleOutput.printInstruction();
                break;
            }
            case ("-3"):
            case ("-get_average_subject_score"): {
                consoleOutput.printAverageSubjectInstructions();
                newInput();
                break;
            }
            case ("-subject"): {
                try {
                    universityActions.getUniversityLessonsAverageScore(inputArray[1]);
                } catch (MissAcademicSubjectsException e) {
                    e.printStackTrace();
                }
                consoleOutput.printInstruction();
                break;
            }
            case ("-help"): {
                consoleOutput.printInstruction();
                newInput();
                break;
            }
            case ("-exit"): {
                consoleOutput.exit();
                break;
            }
            default: {
                consoleOutput.printInputError();
                newInput();
            }
        }
    }
}
