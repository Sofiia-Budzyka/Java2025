package HashMaps;
import HashMaps.Student;
import java.util.HashMap;

public class GradeBook {
    private HashMap<String, Student> studentMap;

    public GradeBook() {
        studentMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
        System.out.println("Успішно додано: " + student.getFullName());
    }

    public void removeStudent(String id) {
        if (studentMap.containsKey(id)) {
            Student removedStudent = studentMap.remove(id);
            System.out.println("Видалено студента: " + removedStudent.getFullName());
        } else {
            System.out.println("Помилка: Студента з ID " + id + " не знайдено.");
        }
    }

    public Student findStudent(String id) {
        return studentMap.get(id);
    }

    public void displayAllStudents() {
        System.out.println("\nЖУРНАЛ ОЦІНОК");
        if (studentMap.isEmpty()) {
            System.out.println("Журнал порожній.");
        } else {
            for (Student student : studentMap.values()) {
                System.out.println(student);
            }
        }
    }
}