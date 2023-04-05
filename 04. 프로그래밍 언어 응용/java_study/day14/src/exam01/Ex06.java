package exam01;

import java.util.Stack;

public class Ex06 { //Stack
    public static void main(String[] args){
        Stack<String> names = new Stack<>();
        names.push("이름1");
        names.push("이름2");
        names.push("이름3");
        names.push("이름4");
        names.push("이름5");

        while (names.size() > 0){ //순차적이 아닌 거꾸로 이름 출력
            String name = names.pop();
            System.out.println(name);
        }
    }//main
}
