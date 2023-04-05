package exam01;

import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args){
//        int total = IntStream.rangeClosed(0,100).map(n -> n*n)
//                .peek(n -> System.out.println(n)).sum();

        IntStream stm = IntStream.rangeClosed(0,100).map(n -> n*n)
                .peek(n -> System.out.println(n)); //중간연산
        //.peek(): 중간에 뭐가 껴있는지 확인하는것
        int total = stm.sum(); //최종연산
        System.out.printf("total=%d%n", total);
    }//main
}
