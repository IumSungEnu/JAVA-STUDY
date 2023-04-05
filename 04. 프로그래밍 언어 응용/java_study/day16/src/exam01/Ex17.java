package exam01;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex17 {
    public static void main(String[] args){
        OptionalInt opt = IntStream.rangeClosed(1, 100)
                .reduce((acc, n) -> {
                    System.out.printf("acc=%d, n=%d%n", acc, n);
                    acc += n;
                    return acc;
                });
        int total = opt.getAsInt();
        System.out.println(total);
    }
}
