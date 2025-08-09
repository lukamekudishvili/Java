package Hackerrank.JavaLoopsII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        int a, b, n;
        List<List<Integer>> listToPrint = new ArrayList<>(num);
        for (int i = 1; i <= num; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            List<Integer> list = new ArrayList<>();
            int k = 1, prev = 0, curr = a+b*k;
            list.add(curr);
            for (int j = 2; j <= n; j++) {
                k*=2;
                prev=curr;
                curr=prev+b*k;
                list.add(curr);

            }
            for (var element : list) {
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }
}
