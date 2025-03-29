import java.util.function.Supplier;

public class Main6 {
    public static void main(String[] args) {
        Supplier<String> supplier=()->{return "I Love Java";};

        String iLoveJava=supplier.get();
        System.out.println(iLoveJava);
    }
}
