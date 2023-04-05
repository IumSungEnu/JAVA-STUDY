package exam01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex05 { //문자열 결합 Collectors.joining
    public static void main(String[] args){
        String[] fruits = {"Apple", "mango", "Orange"};
        String str = Arrays.stream(fruits).collect(Collectors.joining(","));
        System.out.println(str);
    }
} //결과값 : Apple,mango,Orange -> , 가 추가되어 출력됨
