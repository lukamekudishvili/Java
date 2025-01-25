import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] myArray= new int[]{1,3,5,7,12,11,75};
        reverse(myArray);

    }
    public static void reverse(int[] array){
        for(int i=0; i<array.length/2; i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
