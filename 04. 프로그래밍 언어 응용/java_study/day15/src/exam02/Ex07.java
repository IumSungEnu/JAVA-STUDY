package exam02;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        Arrays.setAll(nums, n -> n * n);
        System.out.println(Arrays.toString(nums));
    }//main
}
