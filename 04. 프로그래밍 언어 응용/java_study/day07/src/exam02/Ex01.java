package exam02;

public class Ex01 {
    public static void main(String[] args){
        SimpleCalculator cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);

        int result2 = cal.minus(20,10);
        System.out.println(result2);

        //cal.num = 10;  //정적 상수 - 변수 선언 불가능

        System.out.println(Calculator.num); //바로 값을 호출한다.

        Calculator.instanceMethod();
    }
}
