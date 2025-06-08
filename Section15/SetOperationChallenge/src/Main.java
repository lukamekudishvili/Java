import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks);
    }

    private static void sortAndPrint(String header, Collection<Task> collection){
        sortAndPrint(header,collection,null);
    }
    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter){
        String lineSeparator="_".repeat(90);

        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list= new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

    private static Set<Task> getUnion(List<Set<Task>> sets){
        Set<Task> union= new HashSet<>();
        for(var taskSet: sets){
            union.addAll(taskSet);
        }

        return union;
    }
}
