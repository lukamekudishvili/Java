import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static Random rnd= new Random();

    public static void main(String[] args) {
        String[] names={"Luka", "Anna", "Bob", "Levan", "Tako", "Giorgi", "Mariami"};
        Arrays.setAll(names,
                (i)->names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        List<String> backedByArray=Arrays.asList(names);
        System.out.println("<----------------------------------->");
        backedByArray.replaceAll(s->s+=" "+getRandomChar('A', 'D'));
        backedByArray.forEach(s-> System.out.println(s));

        System.out.println("<----------------------------------->");
        backedByArray.replaceAll(s->getReversedName(s));
        backedByArray.forEach(s-> System.out.println(s));

    }

    public static char getRandomChar(char startChar, char endChar){
        return (char) rnd.nextInt((int) startChar,(int)endChar+1);
    }

    private static String getReversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
