import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1= new Employee("Minnie", "Mouse","01/02/2015");
        Employee e2= new Employee("Mickie", "Mouse","05/08/2000");
        Employee e3= new Employee("Daffy", "Duck","01/02/2011");
        Employee e4= new Employee("Daisy", "Duck","11/02/2012");
        Employee e5= new Employee("Goofy", "Duck","11/02/2012");

        List<Employee> list= new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
    }

    public static void printOrderedList(List<Employee> eList, String sortField){
        int currentYear= LocalDate.now().getYear();

        class myEmployee{
            Employee containedEmployee;
            int yearsWorked;
            String fullName;


        }
    }
}
