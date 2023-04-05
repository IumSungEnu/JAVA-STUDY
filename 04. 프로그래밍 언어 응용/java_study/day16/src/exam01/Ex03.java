package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args){
        String[] strs = {"A", "B", "C", "D"};

        Arrays.stream(strs).forEach(s -> System.out.println(s));
    }
}
