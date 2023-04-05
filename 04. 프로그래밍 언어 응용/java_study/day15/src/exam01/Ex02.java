package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02 {  //Arrays의 편의기능
    public static void main(String[] args){

        List<String> alpha = Arrays.asList("A","A","B","C");
        int cnt = Collections.frequency(alpha,"A");
        //.frequency -> "A"라는 오브젝트의 갯수를 센다.
        System.out.println(cnt);

        boolean result = Collections.replaceAll(alpha, "A", "AA");
        //.replaceAll -> "A"라는 객체를 전부 "AA"로 바꾼다.
        System.out.println(alpha);

        Collections.reverse(alpha);  //거꾸로 읽는다.
        System.out.println(alpha);

        Collections.rotate(alpha,2);  //.rotate -> 칸 이동
        System.out.println(alpha);

        Collections.rotate(alpha,1);  //.rotate -> 칸 이동
        System.out.println(alpha);

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Collections.shuffle(nums);   //.shuffle -> 순서를 임의로 섞는다.
        System.out.println(nums);


    }
}
