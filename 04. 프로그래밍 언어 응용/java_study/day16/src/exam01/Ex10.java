package exam01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex10 {
    public static void main(String[] args){
        List<String> strs = Arrays.asList("melon", "banana", "apple", "orange");

        //.sorted():정렬
        //strs.stream().sorted().forEach(System.out::println); //기본적으로 정렬 -> 오름차순
        //strs.stream().sorted((s1,s2)-> s2.compareTo(s1)).forEach(System.out::println); //내림차순 -> 너무길다
        //     ↓    위 코드를 간단하게 정리한것(내림차순) .reverseOrder()
        //strs.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //매우 중요 ★★★★★
        List<String> strs2 = strs.stream()
                .peek(System.out::println) //중간연산
                .map(s -> "[" + s + "]")   //중간연산
                .toList();  //최종연산
        
        System.out.println(strs2);
    }
}
