package exam04;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args){
        Random random = new Random();
        random.ints().limit(4).forEach(System.out::println);
    }
}
