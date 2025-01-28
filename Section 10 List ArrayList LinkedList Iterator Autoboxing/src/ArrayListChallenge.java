//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ArrayListChallenge {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String menu =
//                """
//                        Available actions:
//                        0 - to shutdown
//                        1 - to add item(s) to list (comma delimited list)
//                        2 - to remove any items (comma delimited list)
//                        Enter a number for which action you want to do:
//                        """;
//        int input;
//        ArrayList<String> groceries = new ArrayList<>();
//        do {
//            System.out.println(menu);
//            input = sc.nextInt();
//            if (input == 1) {
//                System.out.println("Type items list (comma delimited list) to add in groceries list:");
//                String newItems = sc.next();
//                addItemsToList(groceries, newItems);
//                System.out.println("After Adding elements: ");
//                System.out.println(groceries);
//                System.out.println("--------------------------------");
//            }
//
//        } while (input != 0);
//    }
//
//    private static void addItemsToList(ArrayList<String> listToAddIn, String items) {
//        String[] itemsToAdd = items.split(",");
//        List<String> itemsBeforeFilter= new ArrayList<>(List.of(itemsToAdd));
//        for(String item : itemsBeforeFilter){
//            if(listToAddIn.contains(item)){
//                System.out.println("List already contains, so it won't be added to list "+ item);
//                itemsBeforeFilter.remove(item);
//            }
//        }
//        listToAddIn.addAll(itemsBeforeFilter);
//    }
//}
