package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex14 {  //findFirst()
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Melon");

        String fruit = fruits.stream().filter(s -> s.length() == 5).findFirst().get();
        System.out.println(fruit);
    }
}
