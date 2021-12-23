package storage;

import student.Student;

import java.util.List;

public class Storage {
    final static String[] firstNameArray = {"Abraham", "Adam", "Adrian", "Albert", "Bernard", "Brian", "Caleb", "Calvin", "Carl", "Chad", "Charles", "Daniel", "Darren", "David", "Derek", "Dirk", "Donald", "Douglas", "Dwight", "Edgar", "Eric", "Gabriel", "Gerald", "Grant", "Harry", "Jack", "Jasper", "Keith", "Kurt", "Louis", "Malcolm", "Maximilian", "Neil", "Scott", "Terence", "Wilfred"};
    final static String[] lastNameArray = {"Abramson", "Adamson", "Adderiy", "Addington", "Babcock", "Backer", "Baldwin", "Bargeman", "Barnes", "Barrington", "Clapton", "Clifford", "Coleman", "Conors", "Cook", "Cramer", "Creighton", "Donovan", "Douglas", "Dowman", "Dutton", "Duncan", "Dunce", "MacAdam", "MacAlister", "MacDonald", "Macduff", "Laird", "Lamberts", "Larkins", "Saunder", "Sheldon", "Shackley", "Lawman", "Mackenzie", "Samuels"};
    final static String[] universityFaculties = {"Art_Faculty", "Faculty_Of_ScreenArts", "Theatre_Faculty"};
    final static String[] artFacultyAcademicSubjects = {"Calligraphy", "Sculpture", "Painting", "Drawing"};
    final static String[] facultyOfScreenArtsAcademicSubjects = {"Sound_engineering", "Video_editing", "Light_setting", "Movie_history"};
    final static String[] theatreFacultyAcademicSubjects = {"Literature", "Acting_skills", "Choreography", "Philosophy"};
    static List<Student> allUniversityStudents;

    public static List<Student> getAllUniversityStudents() {
        return allUniversityStudents;
    }

    public void setAllUniversityStudents(List<Student> allUniversityStudents) {
        Storage.allUniversityStudents = allUniversityStudents;
    }

    public String[] getFirstNameArray() {
        return firstNameArray;
    }

    public String[] getLastNameArray() {
        return lastNameArray;
    }

    public String[] getUniversityFaculties() {
        return universityFaculties;
    }

    public static String[] getArtFacultyAcademicSubjects() {
        return artFacultyAcademicSubjects;
    }

    public static String[] getFacultyOfScreenArtsAcademicSubjects() {
        return facultyOfScreenArtsAcademicSubjects;
    }

    public static String[] getTheatreFacultyAcademicSubjects() {
        return theatreFacultyAcademicSubjects;
    }
}