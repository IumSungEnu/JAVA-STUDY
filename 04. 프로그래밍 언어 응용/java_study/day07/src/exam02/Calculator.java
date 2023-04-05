package exam02;

public interface Calculator {  //인터페이스는 설계만 가능하다.(추상메서드)
    int num = 10;  //public static final -> 상수

    int add(int num1, int num2);  //public abstract

    default int minus(int num1, int num2){  //default를 사용하면 따로
        privateMethod();  //default 내부에서만 사용
        return num1 - num2;
    }

    public static void instanceMethod(){
        System.out.println("정적 메서드");
    }

    public static void privateMethod(){
        System.out.println("private 메서드");  //private은 default 안에서만 사용이 가능하다.
    }
}
