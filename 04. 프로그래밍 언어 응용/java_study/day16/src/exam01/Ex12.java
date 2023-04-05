package exam01;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Ex12 { //mapToInt(), mapToLong(), mapToDouble() -편의 기능
    public static void main(String[] args){
        int[] scores = {90,88,100,77,60,89};
        //IntStream stmt = Arrays.stream(scores);
        //반환값은 IntStream

        IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
        long total = stat.getSum();
        double avg = stat.getAverage();
        long count = stat.getCount();
        int max = stat.getMax();
        int min = stat.getMin();

        System.out.printf("total=%d%n", total);
        System.out.printf("avg=%f%n", avg);
        System.out.printf("count=%d%n", count);
        System.out.printf("max=%d%n", max);
        System.out.printf("min=%d%n", min);
    }
}
