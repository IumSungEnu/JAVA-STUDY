package exam01;

public class Ex01 {
    public static void main(String[] args){
        //Calculator cal = new Calculator();  //오류
        SimpleCalculator cal = new SimpleCalculator();
        int result = cal.add(10, 20);
        //int result2 = cal.minus(20,10);
        //System.out.println(result);
        System.out.println(cal.num);
        cal.commonMethod();
    }
}
