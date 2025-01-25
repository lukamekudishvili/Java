import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomArray(20)));
    }
    private static int[] getRandomArray(int size){
        Random random= new Random();
        int[] intArray =new int[size];
        int min=0;

        for(int i=0; i<size; i++){

            intArray[i]=random.nextInt(1000);

            for(int j=0; j<=i; j++){
                if(intArray[j]<intArray[i]){
                    int temp=intArray[j];
                    intArray[j]=intArray[i];
                    intArray[i]=temp;
                }
            }
        }
        return intArray;

    }
}
