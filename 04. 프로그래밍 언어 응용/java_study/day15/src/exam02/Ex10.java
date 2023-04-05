package exam02;

import java.util.function.IntPredicate;

public class Ex10 {
    public static void main(String[] args){
        IntPredicate conds1 = n -> n >= 10;
        IntPredicate conds2 = n -> n <= 100;
        IntPredicate conds3 = conds1.and(conds2); //n >= 10 && n <= 100
        //      ↔  서로 반대로 적용
        IntPredicate conds4 = conds1.negate(); //n < 10
        
        boolean result = conds3.test(120);
        System.out.println(result);

        boolean result2 = conds4.test(15);
        System.out.println(result2);
    }//main
}
