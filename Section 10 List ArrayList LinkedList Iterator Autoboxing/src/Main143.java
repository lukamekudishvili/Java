import java.util.Arrays;

public class Main143 {
    public static void main(String[] args) {
        Integer[] wrapperArray= new Integer[5];
        wrapperArray[0]=50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());
    }

    private static int returnInt(Integer i){
        return i;
    }
    private static Integer returnAnInteger(int i){
        return i;
    }
}
