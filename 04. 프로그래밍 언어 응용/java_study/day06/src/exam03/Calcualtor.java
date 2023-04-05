package exam03;

public abstract class Calcualtor {  //계산기
    public int num = 10;
    public abstract int add(int num1, int num2);   //추상클래스(설계) -> {}가 구현체를 의미
    public abstract int minus(int num1, int num2);
    public void instanceMethod(){
        System.out.println("공통 기능");
    }
}
