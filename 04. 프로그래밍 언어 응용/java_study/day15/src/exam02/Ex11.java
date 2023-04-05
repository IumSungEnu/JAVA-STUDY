package exam02;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Ex11 {  //메서드 참조 - 매개형변수
    public static void main(String[] args){
        //Function<String, String> func1 = s -> s.toUpperCase();
        //      ↓  매개변수 s를 생략가능하다. 더 짧게 작성 가능
        Function<String, String> func1 = String::toUpperCase; //클래스명::메서드명
        String str1 = func1.apply("abc");
        System.out.println(str1);

        //BiPredicate<String, String> func2 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> func2 = String::equals; //객체참조변수::메서드명
        boolean result = func2.test("abc","abc");
        System.out.println(result);
    }
}
