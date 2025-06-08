import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer num = 5;

        Integer[] others = {0, 5, 10, 15, -20, 20};
        for (Integer n : others) {
            int k = num.compareTo(n);
            System.out.printf("%d %s %d: compareTo=%d%n", num,
                    k == 0 ? "==" : (k < 0 ? "<" : ">"), n, k);
        }

        Student tim = new Student("Tim");
        Student[] students = new Student[]{
                new Student("Tim"),
                new Student("Zach"),
                new Student("Ann")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

class Student implements  Comparable<Student>{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}