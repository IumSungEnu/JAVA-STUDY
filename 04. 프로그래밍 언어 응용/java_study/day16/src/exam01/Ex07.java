package exam01;

import java.util.stream.IntStream;

public class Ex07 {
    public static void main(String[] args){
        int total = IntStream.rangeClosed(1, 100).skip(50)   //.skip(): 건너뛰기
        .peek(System.out::println).sum();
        //.peek(): 중간에 뭐가 껴있는지 확인하는것
        
        System.out.println(total);
        //결과값에 1 ~ 100까지 전부 나와야 하는데 skip()을 사용하였기 때문에 1~50은 건너뛰어 51부터 출력이 된다.
    }
}
