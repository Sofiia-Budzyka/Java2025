package HashMaps;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаємо в системі управління оцінками!");
        for (int i = 1; i <= 2; i++) {
            System.out.println("\nВведіть дані для студента №" + i);

            System.out.print("Введіть ID: ");
            String id = scanner.nextLine();

            System.out.print("Введіть Ім'я: ");
            String firstName = scanner.nextLine();

            System.out.print("Введіть Прізвище: ");
            String lastName = scanner.nextLine();

            ArrayList<Integer> grades = new ArrayList<>();
            System.out.println("Введіть 3 оцінки через пробіл (наприклад: 90 85 70):");
            for (int j = 0; j < 3; j++) {
                if (scanner.hasNextInt()) {
                    grades.add(scanner.nextInt());
                }
            }
            scanner.nextLine();
            Student newStudent = new Student(id, firstName, lastName, grades);
            gradeBook.addStudent(newStudent);
        }
        gradeBook.displayAllStudents();
        scanner.close();
    }
}