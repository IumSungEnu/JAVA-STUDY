package exam02;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args){

        Comparator<String> comp = new Comparator<>() {
        //String -> compareTo
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        };

        //TreeSet<String> names = new TreeSet<>();
        TreeSet<String> names = new TreeSet<>(Comparator.reverseOrder());
        //.reverseOrder() : 자연적인 정렬로 바꾼다.
        names.add("이름2");
        names.add("이름1");
        names.add("이름1");
        names.add("이름3");
        names.add("이름4");

        System.out.println(names);
    }//main
}
