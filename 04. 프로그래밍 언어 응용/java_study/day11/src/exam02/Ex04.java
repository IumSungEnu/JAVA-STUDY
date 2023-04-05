package exam02;

public class Ex04 {
    public static void main(String[] args){
        int num1 = 100;
        Integer num2 = num1;  //-> Integer.valueOF(num1) -> 오토 박싱
        //박스 안에다 기본 자료형(num1)을 넣었다.

        int num3 = num2;  //num2.intValue(); -> 언박싱
        //박스 안에서 꺼냈다.
    }//main
}
