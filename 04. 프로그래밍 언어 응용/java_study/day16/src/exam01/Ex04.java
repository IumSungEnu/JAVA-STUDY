package exam01;

import java.util.function.Consumer;

public class Ex04 {
    public static void main(String[] args){
        String[] strs = {"A", "B", "C", "D"};
        forEach(strs, s -> System.out.println(s));
    }

    public static void forEach(String[] strs, Consumer<String> consumer){
        for(String str : strs){ //내부 반복 처리
            consumer.accept(str);
        }
    }
}
