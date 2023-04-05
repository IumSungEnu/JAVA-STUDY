package exam04;

import java.util.Objects;

public class Ex02 {  //동일한 값을 구하기 위해 hashcode사용
    public static void main(String[] args){
        int num1 = 10;
        String str = "abc";
        int hashcode = Objects.hash(num1, str);
        System.out.println(hashcode);
    }
}
