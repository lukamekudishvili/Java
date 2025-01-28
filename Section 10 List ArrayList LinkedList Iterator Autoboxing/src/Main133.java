import java.util.ArrayList;
import java.util.List;

public class Main133 {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list= List.of(items);
        System.out.println(list);
//        list.add("Luka");
        ArrayList<String> newArrayList= new ArrayList<>(list);
        newArrayList.add("Luka");
        System.out.println(newArrayList);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);
        newArrayList.addAll(nextList);
        System.out.println(newArrayList);

        System.out.println("Third item = "+newArrayList.get(2));
        if(newArrayList.contains("apples")){
            System.out.println("newArrayList contains apples");
        }

    }
}
