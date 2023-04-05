package exam;

public class Ex16 {
    public static void main(String[] args){
        int num = 10;

        boolean result = ++num > 10 || (num = num +10) > 10;
        System.out.println(result);
        System.out.println(num);

        boolean result1 = false;
        boolean result2 = !result;  //false -> true
        System.out.println(result2);
        boolean result3 = !result2;  //true -> false
        System.out.println(result3);

    }
}
