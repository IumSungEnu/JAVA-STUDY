package exam;

public class Ex06 {
    public static void main(String[] args){
        byte num1 = 100;
        int num2 = num1;  //byte -> int  묵시적 형변환(작은 자료형에서 큰 자료형으로 변환)
        long num3 = num2;  //int -> long 묵시적 형변환

        int num4 = 1000000;
        double num5 = num4;  //실수 > 정수 -> int -> double 묵시적 형변환
        float num6 = num4;  //int -> float 묵시적 형변환

        float num7 = num3;  //long -> float 묵시적 형변환(정수는 실수보다 수가 적기 때문에
                            //                         항상 실수가 정수보다 큰 값을 가질수 있다)


        // byte -> short -> int -> long -> float -> double : 묵시적 형변환
    }
}
