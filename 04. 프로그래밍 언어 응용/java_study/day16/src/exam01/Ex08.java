package exam01;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args){
        //filter를 사용하여 갯수의 길이를 지정하여 지정된 길이의 문자를 출력한다. 여기서는 3자리 수의 문자를 출력
        String[] strs = {"A","AA","AAA","AAAA","BB","BBBB"};
        //Arrays.stream(strs).filter(s -> s.length() >= 3).forEach(System.out::println);

        String[] strs2 = Arrays.stream(strs)
                .filter(s -> s.length() >= 3)
                //.toArray(i -> new String[i]);
                .toArray(String[]::new);  //메서드 참조

        System.out.println(Arrays.toString(strs2));
    }
}
