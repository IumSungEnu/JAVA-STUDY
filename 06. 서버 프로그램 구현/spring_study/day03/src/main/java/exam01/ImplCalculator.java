package exam01;

import java.util.stream.StreamSupport;

public class ImplCalculator implements Calculator{ //반복문 형식
    public long factorial(long num) {
        /*
        //시작 시간
        long startTime = System.nanoTime();  //차이가 짧을수록 성능이 좋은거고 길수록 성능이 떨어진다.
        int total = 1;
        for(int i = 1; i < num; i++){
            total *= i;
        }
        //도착 시간
        long endTime = System.nanoTime();
        System.out.printf("걸린시간 : %d%n", endTime - startTime);
        return total;
        */

        int total = 1;
        for(int i = 1; i < num; i++){
            total *= i;
        }
        return total;
    }
}
