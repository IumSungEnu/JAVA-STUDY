package exam01;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {
    public static void main(String[] args){  //중복 제거
        Set<String> names = new HashSet<>();
        names.add(new String("이름1"));  //equals, hashCode
        names.add(new String("이름2"));
        names.add(new String("이름1"));
        names.add(new String("이름3"));
        System.out.println(names);
    }
}

