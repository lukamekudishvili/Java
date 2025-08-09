package Hackerrank.JavaDataTypes;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine()); // number of test cases

        for (int i = 0; i < t; i++) {
            String num = scanner.nextLine();

            try {
                long value = Long.parseLong(num);

                System.out.println(num + " can be fitted in:");

                if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // If it fits in long (always true if parseLong succeeds)
                System.out.println("* long");

            } catch (NumberFormatException e) {
                System.out.println(num + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}

