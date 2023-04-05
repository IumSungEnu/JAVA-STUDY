package exam03;

public class Ex01 {
    public static void main(String[] args){
        //Calcualtor cal = new Calcualtor();
        //cal.add(10,20);

        Calcualtor cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);

        System.out.println(cal.num);

        int result2 = cal.minus(20,10);
        System.out.println(result2);

        Calcualtor cal2 = new ComplexCalculator();
    }
}
