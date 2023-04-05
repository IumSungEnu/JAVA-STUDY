package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex16 { //reduce()
    public static void main(String[] args){
        int total = IntStream.rangeClosed(1, 100)
                .reduce(1, (acc, n) -> {
                    System.out.printf("acc=%d, n=%d%n", acc, n);
                    acc += n;
                    return acc;
                });
        System.out.println(total);

        int[] nums = {60,10,15,30,80,66};
        int max = Arrays.stream(nums)
                //.reduce(Integer.MIN_VALUE, (a,b) -> a>b ? a:b); //최대값
                .reduce(Integer.MIN_VALUE, (a,b) -> {
                    int maxNumber = b;
                    if (a > b) {
                        maxNumber = a;
                    }
                    System.out.printf("prevMax=%d, courrMax=%d%n", a, b, maxNumber);
                    return maxNumber;
                });
        System.out.println(max);

        int min = Arrays.stream(nums)
                .reduce(Integer.MAX_VALUE, (a,b) -> a>b ? b:a); //최소값
        System.out.println(min);
        
        //      ↓   위에 최대값과 최소값을 단순히 작성하는 경우(굳이 위처럼 작성할 필요는 없다) - 제공하는 기능

        int max2 = Arrays.stream(nums).max().getAsInt();
    }
}
