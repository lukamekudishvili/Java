import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main1 {
    public static void main(String[] args) {
        String sentence = "Hello, My name is Luka. I really want to be a good Java developer.";
        splitSentence(sentence, (s) -> {
                    String[] parts = sentence.split(" ");
                    for (String part : parts) {
                        System.out.println(part);
                    }
                }
        );

        System.out.println("<----------------------------------->");

        Consumer<String> splittedSentence =
                str -> {
                    String[] parts = str.split(" ");
                    for (String part : parts) {
                        System.out.println(part);
                    }
                };

        splittedSentence.accept(sentence);

        System.out.println("<----------------------------------->");

        Consumer<String> splittedSentenceForEach = (str) ->
        {
            List<String> parts = Arrays.asList(str.split(" "));
            parts.forEach((part) -> System.out.println(part));

        };
        splittedSentenceForEach.accept(sentence);


    }

    public static <T> void splitSentence(T sentence, Consumer<T> consumer) {
        consumer.accept(sentence);
    }
}
