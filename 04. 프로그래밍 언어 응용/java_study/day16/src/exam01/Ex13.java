package exam01;

import java.util.Arrays;

public class Ex13 {
    public static void main(String[] args){
        int[] scores = {90,88,100,88,80,85};
        boolean result1 = Arrays.stream(scores).allMatch(s -> s >= 80);
        System.out.printf("result1=%s%n", result1);
        //70점 짜리가 하나 있으면 조건에 80이상으로 적었기 때문에 결과값은 false, 없으면 true

        boolean result2 = Arrays.stream(scores).anyMatch(s -> s == 100);
        System.out.printf("result2=%s%n", result2);

        //.noneMatch()  <->  .allMatch()와 반대
        boolean result3 = Arrays.stream(scores).noneMatch(s -> s < 80);
        System.out.printf("result3=%s%n", result3);
    }
}
