package exam01;

public class Ex06 {
    public static void main(String[] args){
        Schedule2 s1 = new Schedule2();
        System.out.println("s1= " +s1);
        s1.printThis();

        Schedule2 _this = s1.returnThis();
        System.out.println(_this == s1);
    }
}
