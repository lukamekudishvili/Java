public class Main126 {
    public static void main(String[] args) {
        String[] splitStrings= "Hello, my name is Luka. I am from Georgia.".split(" ");
        printText(splitStrings);
        printText("Hello, my name is Luka");

    }
    private static void printText(String... textList){
        for(String t: textList){
            System.out.println(t);
        }
    }
}
