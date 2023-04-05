package exam01;

import java.util.Random;

public class Ex06 {
    public static void main(String[] args){
        Random rand = new Random();
        rand.ints().limit(10).forEach(System.out::println); //10개의 숫자가 랜덤출력 - 람다식
        //         .limit():갯수 제한       ㄴ> 최종연산
    }//main
}
