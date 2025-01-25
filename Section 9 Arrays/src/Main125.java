import java.util.Arrays;

public class Main125 {
    public static void main(String... args) {
        int[] myIntArray = new int[5];
        int[] anotherArray= myIntArray;

        System.out.println("myIntArray " +Arrays.toString(myIntArray));
        System.out.println("anotherArray " +Arrays.toString(anotherArray));

        myIntArray[0]=99;

        System.out.println("myIntArray " +Arrays.toString(myIntArray));
        System.out.println("anotherArray " +Arrays.toString(anotherArray));

        anotherArray[4]=39;
        System.out.println("myIntArray " +Arrays.toString(myIntArray));
        System.out.println("anotherArray " +Arrays.toString(anotherArray));
    }
}
