package exam02;

public class Ex02 {
    public static void main(String[] args){
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);

        System.out.println(System.identityHashCode(num1));
        System.out.println(System.identityHashCode(num2));
    }
}
