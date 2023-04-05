package exam03;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args){
        Integer[] nums1 = {0,1,2,3,4,5,6,7,8,9,10};
        int total = Arrays.stream(nums1).mapToInt(n -> n).sum();

        List<Integer> nums2 = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        int total2 = nums2.stream().mapToInt(n -> n).sum();
    }
}
