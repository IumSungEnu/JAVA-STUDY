package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args){
        Integer[] nums1 = { 0,1,2,3,4,5,6,7,8,9,10};
        List<Integer> nums2 = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);

        Stream stm1 = Arrays.stream(nums1);
        Stream stm2 = nums2.stream();

        long cnt1 = stm1.count();
        long cnt2 = stm2.count();

        //처리의 통일성
        //int total1 = Arrays.stream(nums1).mapToInt(n->n).sum();
        //int total2 = nums2.stream().mapToInt(n->n).sum();
        //사용하는 방식이 달라도 stream()으로 통일하여 결과값을 호출한다. 결과값은 같다.

        System.out.printf("count1=%d%n", cnt1);
        System.out.printf("count2=%d%n", cnt2);

        //long cnt3 = stm1.count();  //stream은 1회용(한번밖에 사용할 수 없다.)
        long cnt3 = Arrays.stream(nums1).count();  //새로 만들어줘야 한다.
        System.out.printf("count2=%d%n", cnt2);
    }//main
}
