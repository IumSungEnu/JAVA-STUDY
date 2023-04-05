package exam02;

import java.util.function.Function;

public class Ex09 { //identity
    public static void main(String[] args){
        //Function<String, String> func = s -> s;
        Function<String, String> func = Function.identity(); //위 코드와 동일
        String s = func.apply("이름");
        System.out.println(s);
    }//main
}
