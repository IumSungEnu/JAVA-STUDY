package exam01;

public abstract class Calculator {
    public int num = 10;

    public abstract int add(int num1, int num2);  //이렇게만 쓰면 오류가 난다.

    public abstract int minus(int num1, int num2);

    public void commonMethod(){
        System.out.println("공통 기능");
    }
}
