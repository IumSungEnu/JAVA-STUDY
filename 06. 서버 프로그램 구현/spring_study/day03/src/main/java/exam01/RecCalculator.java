package exam01;

public class RecCalculator implements Calculator{ //재귀적 방식 - 좀더 작성하기 편하다.
    public long factorial(long num) {
        /*
        long startTime = System.nanoTime(); //차이가 짧을수록 성능이 좋은거고 길수록 성능이 떨어진다.

        try {
            if (num == 0) { //num가 0일때 멈춘다.
                return 1;
            }

            return num * factorial(num - 1); //이렇게만 적으면 출력이 안된다. 위에 if문을 사용해야 한다.

        }finally { //리턴한다고 해도 무조건 실행된다.
            long endTime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n", endTime - startTime);
        }
        */

        if (num == 0) { //num가 0일때 멈춘다.
            return 1;
        }
        return num * factorial(num - 1);
    }
}
