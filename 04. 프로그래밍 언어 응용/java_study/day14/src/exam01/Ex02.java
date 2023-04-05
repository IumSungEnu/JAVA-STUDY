package exam01;

import java.util.LinkedList;
import java.util.Queue;

public class Ex02 {
    public static void main(String[] args){
        Queue<String> names = new LinkedList<>();
        names.offer("이름1");
        names.offer("이름2");
        names.offer("이름3");
        names.offer("이름4");
        names.offer("이름5");
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());

        /*
        for(int i = 0; i < names.size(); i++){ //* Queue은 .size()를 제공하지 않기 때문에
                                               // for문을 작성하여 사용하기 어렵다.
            String name = names.poll();
            System.out.println(name);
        }
        */
    }//main
}
