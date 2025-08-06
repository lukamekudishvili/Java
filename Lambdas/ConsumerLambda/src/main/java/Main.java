import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(
                List.of("alpha", "bravo", "charlie", "delta")
        );

        list.forEach(s ->
                System.out.println(s));
    }
}
