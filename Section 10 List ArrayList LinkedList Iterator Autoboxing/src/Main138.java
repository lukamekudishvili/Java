import java.util.LinkedList;
import java.util.ListIterator;

public class Main138 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
//        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
//        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);
//        retrieveElement(placesToVisit);

//        System.out.println("--------------------------------------------------");
//        printItinerary(placesToVisit);
//        System.out.println("--------------------------------------------------");
//        printItinerary2(placesToVisit);
//        System.out.println("--------------------------------------------------");
//        printItinerary3(placesToVisit);

        System.out.println("--------------------------------------------------");
        testIterator(placesToVisit);

        System.out.println("--------------------------------------------------");
        testListIterator(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue Methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowomba");

        //Stack Methods
        list.push("Alice Springs");
    }

    public static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); //removes first element
        System.out.println("Removed" + s1);

        String s2 = list.removeFirst(); //removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); //removes last element
        System.out.println("Removed: " + s3);

        //Queue remove methods
        String p1 = list.poll(); //removes first element
        System.out.println("Removed: " + p1);

        String p2 = list.poll(); //removes first element
        System.out.println("Removed: " + p2);

        String p3 = list.pollLast(); //removes first element
        System.out.println("Removed: " + p3);

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); //removes firstElement
        System.out.println(p4 + " was removed");
    }

    public static void retrieveElement(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        //Queue retrieval methods
        System.out.println("Element from element() = " + list.element()); //returns first element

        //Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " +town);
            previousTown=town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator=list.listIterator(1);
        while(iterator.hasNext()){
            var town=iterator.next();
            System.out.println("--> From: " + previousTown + " to " +town);
            previousTown=town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    private static void testIterator(LinkedList<String> list){
        var iterator=list.iterator();
        System.out.println(list);
        while(iterator.hasNext()){
            if(iterator.next().equals("Brisbane")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    private static void testListIterator(LinkedList<String> list){
        var iterator=list.listIterator();
        System.out.println(list);
        while (iterator.hasNext()){
            if(iterator.next().equals("Darwin")){
                iterator.add("Lake Lisi");
            }
        }

        //hasPrevious because hasnext will be always false after first while, its cursor is beyond last element's index
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2=list.listIterator(3);
        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
        System.out.println(iterator2.previous());
    }
}
