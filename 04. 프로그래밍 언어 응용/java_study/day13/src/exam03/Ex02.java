package exam03;

import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름4");
        names.add("이름5");

        names.add(2,"이름3");

        System.out.println(names);
    }//main
}
