package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args){ //ArrayList 순서유지 중요(적힌 순서대로)
        //ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        //printNames(names);

        //LinkedList
        /*LinkedList<String> names = new LinkedList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");
        */
        

        /*
        //삭제 -> 안에 배열이 있기 때문에 전부 삭제가 아닌 부분삭제가 된다.
        for(int i = 0; i < names.size(); i++){
            names.remove(i);
        }*/

        //거꾸로 삭제(맨 뒤에서부터 삭제)
        //for(int i = names.size() -1; i >= 0; i--){
        //    names.remove(i);
        //}
        
        /*
        //조회
        for(int i = 0; i < names.size(); i++){
            String name = names.get(i);
            System.out.println(name);
        }*/
        //             ↓  개발자가 제일 많이 사용하는 방법
        //조회
        /*for(String name : names){
            System.out.println(name);
        }
        */
        
        //private static void
    }//main
}
