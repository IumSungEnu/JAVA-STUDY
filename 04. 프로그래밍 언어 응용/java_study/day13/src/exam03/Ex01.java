package exam03;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args){
        String[] names = {"이름1", "이름2", "이름4", "이름5"};
        
        //이름2 바로 뒤에 이름3을 추가하고 싶을때(복잡함) -> ArrayList(Ex02)
        String[] newNames = new String[5];
        for(int i = 0; i < 2; i++){
            newNames[i] = names[i];
        }
        newNames[2] = "이름3";
        for(int i = 2; i < names.length; i++){
            newNames[i+1] = names[i];
        }
        System.out.println(Arrays.toString(newNames));
    }//main
}
