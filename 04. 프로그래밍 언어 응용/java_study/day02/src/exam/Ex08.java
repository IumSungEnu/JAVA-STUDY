package exam;

public class Ex08 {
    public static void main(String[] args){
        int num1 = 10;
        long num2 = 20L;
        long result = num1 + num2;   //연산은 동일한 자료형 int num1 -> long num1

        double result2 = num1 / 4.0;  //4.0이 double, num1은 int -> int num1 -> double
        System.out.println(result2);

    }
}
