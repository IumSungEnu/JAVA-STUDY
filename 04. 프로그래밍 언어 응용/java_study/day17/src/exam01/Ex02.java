package exam01;

import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args){
        /*
        IntStream.generate(() -> (int)(Math.random() * 10))
                .limit(10)
                .forEach(System.out::println);
         */

        // .iterate() -> 무한스트림, 갯수의 제한을 해줘야 한다.
        IntStream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

    }//main
}
