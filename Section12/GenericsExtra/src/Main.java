import model.LPAStudent;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++) {
            Student student = new Student();
            students.add(student);
        }
        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++) {
            LPAStudent student = new LPAStudent();
            lpaStudents.add(student);
        }
        printList(lpaStudents);
    }

    public static void printList(List<? super LPAStudent> students) {
        for (var student : students) {
            System.out.println(student);
        }
        System.out.println("-".repeat(30));
        System.out.println();
    }
}