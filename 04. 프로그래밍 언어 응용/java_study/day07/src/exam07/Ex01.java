package exam07;

public class Ex01 {
    public static void main(String[] args){
        Outer outer = new Outer();
        //outer.method();
        Calculator cal = outer.method(10);
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
