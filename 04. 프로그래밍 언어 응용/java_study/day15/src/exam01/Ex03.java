package exam01;

import java.util.Arrays;

public class Ex03 {  //Arrays의 편의기능2
    public static void main(String[] args){
        String[] strs1 = {"A","AA","B","C"};
        String[] strs2 = {"A","B","C"};

        boolean result = Arrays.deepEquals(strs1,strs2); //.deepEquals -> 배열과 배열을 비교하여 값이 같으면 true,
                                                         // 값이 다르면 false
        System.out.println(result);

        int result2 = Arrays.mismatch(strs1, strs2); //.mismatch -> 배열과 배열을 비교하여 없는 값 출력
        System.out.println(result2
        );

    }
}
