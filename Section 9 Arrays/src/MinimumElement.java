import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    private static int readInteger(){
        int number=new Scanner(System.in).nextInt();
        return number;
    }

    private static int[] readElements(int size){
        Scanner sc= new Scanner(System.in);
        int[] myArray =new int[size];

        for(int i=0; i<size; i++){
            myArray[i]=sc.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] array){
        int min=array[0];
        for(int num : array){
            if(min>num)min=num;
        }
        return min;
    }
}
