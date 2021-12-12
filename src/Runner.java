import console.ConsoleInput;
import console.ConsoleOutput;
import faculty.ArtFaculty;
import faculty.FacultyOfScreenArts;
import faculty.TheatreFaculty;
import university.University;

public class Runner {
    public static void main(String[] args) {
        ConsoleOutput console = new ConsoleOutput();
        console.instruction();
        ConsoleInput input = new ConsoleInput();
        input.newInput();

        // инициализация института
        new University();

        // инициализация факультетов
        new ArtFaculty();
        new FacultyOfScreenArts();
        new TheatreFaculty();
    }
}
