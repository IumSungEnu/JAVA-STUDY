package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Ex05 { //Enumeration
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        Enumeration<String> enu = Collections.enumeration(names);
        while (enu.hasMoreElements()){
            String name = enu.nextElement();
            System.out.println(name);
        }
    }//main
}
