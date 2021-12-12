package storage;

public class Storage {
    final String[] firstNameArray = {"Abraham", "Adam", "Adrian", "Albert", "Bernard", "Brian", "Caleb", "Calvin", "Carl", "Chad", "Charles", "Daniel", "Darren", "David", "Derek", "Dirk", "Donald", "Douglas", "Dwight", "Edgar", "Eric", "Gabriel", "Gerald", "Grant", "Harry", "Jack", "Jasper", "Keith", "Kurt", "Louis", "Malcolm", "Maximilian", "Neil", "Scott", "Terence", "Wilfred"};
    final String[] lastNameArray = {"Abramson", "Adamson", "Adderiy", "Addington", "Babcock", "Backer", "Baldwin", "Bargeman", "Barnes", "Barrington", "Clapton", "Clifford", "Coleman", "Conors", "Cook", "Cramer", "Creighton", "Donovan", "Douglas", "Dowman", "Dutton", "Duncan", "Dunce", "MacAdam", "MacAlister", "MacDonald", "Macduff", "Laird", "Lamberts", "Larkins", "Saunder", "Sheldon", "Shackley", "Lawman", "Mackenzie", "Samuels"};
    final String[] universityFaculties = {"Art_Faculty", "Faculty_Of_ScreenArts", "Theatre_Faculty"};
    final String[] artFacultyAcademicSubjects = {"Calligraphy", "Sculpture", "Painting", "Drawing"};
    final String[] facultyOfScreenArtsAcademicSubjects = {"Sound engineering", "Video editing", "Light setting", "Movie history"};
    final String[] theatreFacultyAcademicSubjects = {"Literature", "Acting skills", "Choreography", "Philosophy"};

    public String[] getFirstNameArray() {
        return firstNameArray;
    }

    public String[] getLastNameArray() {
        return lastNameArray;
    }

    public String[] getUniversityFaculties() {
        return universityFaculties;
    }

    public String[] getArtFacultyAcademicSubjects() {
        return artFacultyAcademicSubjects;
    }

    public String[] getFacultyOfScreenArtsAcademicSubjects() {
        return facultyOfScreenArtsAcademicSubjects;
    }

    public String[] getTheatreFacultyAcademicSubjects() {
        return theatreFacultyAcademicSubjects;
    }
}