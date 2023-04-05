package exam02;

import java.util.HashSet;

public class Ex01 { //hashSet
    public static void main(String[] args){
        HashSet<String> names = new HashSet<>();
        names.add("이름1");
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");

        //Hash - 검색을 최적화하기 위한 구조

        System.out.println(names);
    }//main
}
