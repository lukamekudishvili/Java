import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        names.add("Walter");

        System.out.println(names);
        names.addAll(List.of("Jesse", "Skyler", "Mike", "Saul"));
        names.forEach(System.out::println);
        names.add("Walter");

        names.remove("Walter");

        names.add("Walter");

        Iterator<String> namesIterator=names.iterator();

        System.out.println("------------------------------");
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        System.out.println("------------------------------");


        Set<String> treeSetNames= new TreeSet<>();

        treeSetNames.add("Walter");

        System.out.println(treeSetNames);
        treeSetNames.addAll(List.of("Jesse", "Skyler", "Mike", "Saul","Zebra"));
        treeSetNames.forEach(System.out::println);


    }
}
