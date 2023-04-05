package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args){

        /* //합계
        int total = IntStream.rangeClosed(1, 10)
                .reduce(0, (acc, num) -> {
                    acc+=num;
                    System.out.printf("acc=%d, num=%d%n", acc, num);
                   return acc;
                });

        */
        
        //최대값 구하기
        int[] nums = {10,5,99,33,105};

        /*
        int max = Arrays.stream(nums).reduce(Integer.MIN_VALUE, (a, b) -> {
           int maximun = b;
           if(a>b){
               maximun = a;
           }
           System.out.printf("a=%d, b=%d, max=%d%n", a, b, maximun);
           return maximun;
        });
        System.out.println(max);

         */
        //      ↓  람다식으로 짧게 적으면 아래처럼 한줄로 완성이 된다.
        int max = Arrays.stream(nums).reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a:b);
        System.out.println(max);
    }//main
}
