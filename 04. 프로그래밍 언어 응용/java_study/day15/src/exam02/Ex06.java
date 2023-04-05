package exam02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex06 { //기본 함수형 인터페이스
    public static void main(String[] args){
        //BiFunction<Integer, Integer, Integer> cal = (a, b) -> a + b; //Bi의 기본형
        
        //BinaryOperator<Integer> cal = (a, b) -> a + b; //성능이 좋지않다.
        //기본형으로 하는것보다 기능이 저하된다(오토박싱, 언박싱 발생)
        //int result = cal.apply(10,20);

        //                 ↓  BinaryOperator<Integer> -> IntBinaryOperator

        IntBinaryOperator cal = (a, b) -> a + b;
        int result = cal.applyAsInt(10,20);
        //BinaryOperator<Integer> cal = (a, b) -> a + b;에서 발생하는 오토박싱, 언박싱이 발생하지 않는다.
        System.out.println(result);
    }//main
}
