package exam;

public class Ex14 {
    public static void main(String[] args){
        //관계(비교) 연산자
        int num = 10;
        boolean result = num > 5;    //true
        System.out.println(result);

        boolean result2 = true && true;    //true
        boolean result3 = true && false;   //false
        System.out.println(result2);
        System.out.println(result3);

        boolean result4 = true || false;
        System.out.println(result4);
    }
}
