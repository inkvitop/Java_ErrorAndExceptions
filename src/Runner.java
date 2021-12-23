import console.ConsoleInput;
import console.ConsoleOutput;
import exceptions.MissFacultyInTheUniversityException;
import storage.SetupLaunch;
import university.University;

public class Runner {
    public static void main(String[] args) throws MissFacultyInTheUniversityException {
        University university = new University();

        if (!SetupLaunch.isEmptyUniversity()) {
            university.initializeFaculties();
        } else {
            throw new MissFacultyInTheUniversityException("The university has no faculties");
        }

        ConsoleOutput console = new ConsoleOutput();
        console.printGreetings();
        console.printInstruction();
        ConsoleInput input = new ConsoleInput();
        input.newInput();
    }
}
