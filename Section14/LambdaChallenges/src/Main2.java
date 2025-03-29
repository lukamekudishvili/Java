import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

// აქ არის ჩელენჯი 2, 3, 4, 5 ერთად
public class Main2 {
    public static void main(String[] args) {

        //პირველი გზა
        UnaryOperator<String> everySecondChar = (str) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 1) returnVal.append(str.charAt(i));
            }
            return String.valueOf(returnVal);
        };
        String sentence = "0123456789";
        System.out.println(everySecondChar.apply(sentence));

        System.out.println("<----------------------------------->");
        //მეორე გზა
        UnaryOperator<StringBuilder> everySecondCharWithBuilder = (str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = 1; i < str.length(); i += 2) {
                result.append(str.charAt(i));
            }
            return result;
        };
        System.out.println(everySecondCharWithBuilder.apply(new StringBuilder("0123456789")));


        System.out.println("<----------------------------------->");
        //მესამე გზა
        StringBuilder builder = new StringBuilder("0123456789");
        StringBuilder myResult=getEverySecondChar(builder, (strBuilder) -> {
            StringBuilder result = new StringBuilder();
            for (int i = 1; i < strBuilder.length(); i += 2) {
                result.append(strBuilder.charAt(i));
            }
            return result;
        });
        System.out.println(myResult);

        String myResultString=getEverySecondChar(sentence, (str) -> {
            String result= "";
            for (int i = 1; i < str.length(); i += 2) {
                result+=str.charAt(i);
            }
            return result;
        });

    }

    public static <T> T getEverySecondChar(T value, UnaryOperator<T> unaryOperator) {
        return unaryOperator.apply(value);
    }
}
