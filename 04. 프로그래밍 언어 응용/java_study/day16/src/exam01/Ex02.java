package exam01;

import java.util.function.BiConsumer;

public class Ex02 { //내부 반복 처리
    public static void main(String[] args){
        String[] data = {"A", "B", "C", "D"};
        printData(data, (str, i) -> System.out.printf("i=%d,str=%s%n", i, str));
    }//main

    public static void printData(String[] data, BiConsumer<String, Integer> consumer){
        for(int i = 0; i < data.length; i++){
            consumer.accept(data[i], i);
        }
    }
}
