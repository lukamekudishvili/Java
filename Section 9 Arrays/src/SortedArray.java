import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        printArray(sortIntegers(getIntegers(size)));

    }

    public static int[] getIntegers(int size){
        Scanner sc= new Scanner(System.in);
        int[] intArray= new int[size];
        for(int i=0; i<size; i++){
            intArray[i]=sc.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] arrayToPrint){
        for(int i=0; i<arrayToPrint.length; i++){
            System.out.println("Element " + i + " contents "+(arrayToPrint[i]));
        }
    }
    public static int[] sortIntegers(int[] arrayToSort){
        for(int i=0; i<arrayToSort.length; i++){
            for(int j=i+1; j<arrayToSort.length; j++){
                if(arrayToSort[i]<arrayToSort[j]){
                    int temp=arrayToSort[i];
                    arrayToSort[i]=arrayToSort[j];
                    arrayToSort[j]=temp;
                }
            }
        }
        return arrayToSort;
    }
}
