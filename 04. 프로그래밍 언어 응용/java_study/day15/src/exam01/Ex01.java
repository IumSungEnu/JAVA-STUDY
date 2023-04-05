package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Ex01 { //Arrays
    public static void main(String[] args){
        List<Integer> nums1 = Arrays.asList(1,2,3,4);
        List<Integer> nums2 = Arrays.asList(5,6,7,8);
        boolean result1 = Collections.disjoint(nums1, nums2);
        System.out.printf("result1 = %s%n", result1);

        Collections.fill(nums1, 0); //값을 0으로 바꾼다
        System.out.println(nums1);

        Enumeration<Integer> enu = Collections.enumeration(nums2); //nums2의 바뀐값을
        List<Integer> nums3 = Collections.list(enu);               //다시 원래대로 바꾼다.
        System.out.println(nums3);
    }//main
}
