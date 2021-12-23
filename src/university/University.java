package university;

import faculty.ArtFaculty;
import faculty.FacultyOfScreenArts;
import faculty.TheatreFaculty;
import storage.Storage;

public class University {
    Storage storage = new Storage();

    public University() {
        storage.setAllUniversityStudents(UniversityActions.universityRecruitment());
    }

    public void initializeFaculties() {
        new ArtFaculty();
        new FacultyOfScreenArts();
        new TheatreFaculty();
    }
}
