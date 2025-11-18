package HashMaps;
import java.util.ArrayList;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    public Student(String id, String firstName, String lastName, ArrayList<Integer> grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Студент: " + firstName + " " + lastName + ", Оцінки: " + grades;
    }
}