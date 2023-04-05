package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args){
        //Calculator cal = (a, b) -> a + b;
        //int result = add(cal, 10, 20);
        //              ↓  더 쉽고 많이 사용하는 방법
        int result = add((a, b) -> a + b, 10,20);
        System.out.println(result);

        List<String> alpha = Arrays.asList("A","B","C");
        alpha.forEach(s -> System.out.println(s));  //이게 람다식을 쓰는 이유(짧게 쓰기 위해서)
    }//main

    public static int add(Calculator cal, int num1, int num2){
        //여기에서 add는 Calculator cal = (a, b) -> a + b;
        int result = cal.add(num1, num2);
        return result;
    }

}
