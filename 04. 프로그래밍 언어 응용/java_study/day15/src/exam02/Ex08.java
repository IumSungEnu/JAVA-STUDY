package exam02;

import java.util.function.Function;

public class Ex08 { //andThen, compose
    public static void main(String[] args){
        Function<String, String> func1 = s -> s.toUpperCase();
        Function<String, String> func2 = s -> s.substring(1); //잘라서 사용

        String str = func1.apply("abcdefg");
        String str2 = func2.apply("abcdefg");

        System.out.println(str);
        System.out.println(str2);

        Function<String, String> func3 = func1.andThen(func2); //앞에서 뒤로 합(1 + 2)
        String str3 = func3.apply("abcdefg");
        System.out.println(str3);

        Function<String, String> func4 = func2.compose(func1); //뒤에서부터 앞으로 합(2 + 1)
        String str4 = func4.apply("abcdefg");
        System.out.println(str4);
    }//main
}
