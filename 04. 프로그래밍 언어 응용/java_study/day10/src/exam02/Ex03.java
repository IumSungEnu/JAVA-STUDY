package exam02;

public class Ex03 {
    public static void main(String[] args){
        //boolean result1 = checkSame("abc", "abc");  //true
        boolean result1 = checkSame("abc", new String("abc"));  //false 
        System.out.println(result1);
    }

    public static boolean checkSame(String str1, String str2){
        //return str1 == str2;
        return str1.equals(str2);  //new 생성자를 사용한 경우 equals 사용 - 동등성 비교
    }
}
