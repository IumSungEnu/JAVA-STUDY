package exam01;

public class ProxyCalculator implements Calculator{ //다른 계산기의 기능을 대신 수행

    private Calculator calculator;
    public ProxyCalculator(Calculator calculator){
        //다형성 -> Calculator 지정
        this.calculator = calculator;

    }

    @Override
    public long factorial(long num) {

        long startTime = System.nanoTime(); //시작 시간 - 공통 기능

        long result = calculator.factorial(num);  //대신 수행해 준다. 핵심기능

        long endTime = System.nanoTime();  //종료 시간 - 공통 기능
        System.out.printf("걸린시간 : %d%n", endTime - startTime);

        return result;
    }

}
