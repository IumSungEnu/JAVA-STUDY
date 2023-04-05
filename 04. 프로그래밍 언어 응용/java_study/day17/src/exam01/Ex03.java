package exam01;

import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args){
        IntStream stm1 = IntStream.rangeClosed(1, 10);
        IntStream stm2 = IntStream.rangeClosed(11, 20);
        IntStream stm3 = IntStream.concat(stm1, stm2);

        int total = stm3.peek(System.out::println).sum();
        System.out.printf("total=%d%n", total);
    }
}
