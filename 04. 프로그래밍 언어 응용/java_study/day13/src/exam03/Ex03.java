package exam03;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        //제거
        for(int i = 0; i < names.size(); i++){
            names.remove(i);
        }

        for(int i = 0; i < names.size(); i++){
            String name = names.get(i);
            System.out.println(name);
        }

    }//main
}
