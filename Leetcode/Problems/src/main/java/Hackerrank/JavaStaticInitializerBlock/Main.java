package Hackerrank.JavaStaticInitializerBlock;

import java.util.Scanner;

public class Main {
private static final Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        int breadth=scanner.nextInt();
        int height=scanner.nextInt();

        try{
            System.out.println(getArea(breadth,height));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static int getArea(int breadth, int height) throws Exception {
        if(breadth<=0 || height<=0){
            throw new Exception("Breadth and height must be positive");
        }

        return breadth*height;
    }
}
