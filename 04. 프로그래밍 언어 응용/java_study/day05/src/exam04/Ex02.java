package exam04;

public class Ex02 {
    public static void main(String[] args){
        Calculator cal = Calculator.getInstance();

        Calculator cal2 = Calculator.getInstance();

        System.out.println(cal == cal2);

        cal.add(10, 20);
        cal2.minus(20, 10);

        System.out.println(System.identityHashCode(cal));
        System.out.println(System.identityHashCode(cal2));
    }//main
}
