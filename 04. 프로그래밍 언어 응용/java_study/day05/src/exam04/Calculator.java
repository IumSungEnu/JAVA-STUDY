package exam04;

public class Calculator {

    private static Calculator instance = new Calculator();
    private Calculator(){}

    public static Calculator getInstance(){
        if(instance == null){
            instance = new Calculator();
        }
        return instance;
    }
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public static int minus(int num1, int num2){
        return num1 - num2;
    }
}
