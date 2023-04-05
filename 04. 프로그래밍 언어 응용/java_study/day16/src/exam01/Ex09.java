package exam01;

import java.util.Arrays;

public class Ex09 {
    public static void main(String[] args){
        String[] strs = {"A","AA","AAA","AAAA","AA","BB","BBBB"};
        Arrays.stream(strs).distinct().forEach(System.out::println);
        //.distinct(): 중복제거
    }
}
