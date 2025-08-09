package RemoveDuplicatesFromSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4,8}));
    }
    public static int removeDuplicates(int[] nums) {
        List<Integer> uniqueNums= new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            if(!uniqueNums.contains(nums[i])){
                uniqueNums.add(nums[i]);
                nums[i]=9;
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return uniqueNums.size();
    }
}
