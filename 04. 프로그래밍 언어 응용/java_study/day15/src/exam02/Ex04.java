package exam02;

public class Ex04 {
    public static void main(String[] args){
        Calculator cal = getCalculator();
        int result = cal.add(10,20);
        System.out.println(result);
    }//main

    public static Calculator getCalculator(){
        //Calculator cal = (a, b) -> a + b;
        //return cal;
        return (a, b) -> a + b;
    }
}
