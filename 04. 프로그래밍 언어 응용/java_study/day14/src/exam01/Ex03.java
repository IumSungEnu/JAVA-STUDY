package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {  //Iterator
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        //Iterator는 한번밖에 반복을 안한다.
        iter = names.iterator();  //그래서 한번 더 만들어야 한다.
        while (iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        //               ↓
        //그런데 이렇게 하기에는 너무 번거롭다.

    }//main
}
