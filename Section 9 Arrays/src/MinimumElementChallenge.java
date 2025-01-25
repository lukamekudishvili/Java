import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        String numbers=new Scanner(System.in).nextLine();
        System.out.println(findMin(readIntegers(numbers)));
    }

    public static int[] readIntegers(String numbers){
        String[] StringArrayOfNumbers= numbers.split(",");
        int[] intArrayOfNumbers=new int[StringArrayOfNumbers.length];
        int i=0;
        for(String num : StringArrayOfNumbers){
            intArrayOfNumbers[i]=Integer.parseInt(num);
            i++;
        }
        return intArrayOfNumbers;
    }

    public static int findMin(int[] array){
        int min=array[0];
        for(int num : array){
            if(min>num)min=num;
        }
        return min;
    }
}
