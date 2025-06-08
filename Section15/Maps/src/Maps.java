import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> empIds= new HashMap<>();
        empIds.put("Luka",12345);
        empIds.put("Carl",12346);
        empIds.put("jerry",12347);
        empIds.put("Luka1",12345);
//        empIds.put("Luka",12345);

        System.out.println(empIds);
        System.out.println(empIds.get("Luka"));

        System.out.println(empIds.containsKey("jerry"));
        System.out.println(empIds.containsValue(12345));

        empIds.put("Carl",999);
        System.out.println(empIds);

        empIds.replace("Mariami",1231111); //won't do anything because there is not sich key "Mariami"

        empIds.putIfAbsent("Lukaku",777000);
        System.out.println(empIds);

        System.out.println(empIds.remove("Lukaku"));
        System.out.println(empIds);
    }
}
