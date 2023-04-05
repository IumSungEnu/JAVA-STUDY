package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Melon");

        int[] lengths = fruits.stream()
                            .filter(s -> s.length() == 5)
                            .mapToInt(String::length)  //자료형태를 정수로 바꾼다.
                            .toArray();
        System.out.println(Arrays.toString(lengths));
    }
}
