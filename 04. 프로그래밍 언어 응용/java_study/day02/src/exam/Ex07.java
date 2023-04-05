package exam;

public class Ex07 {
    public static void main(String[] args){
        int num = 10000000;
        byte num2 = (byte)num;  //자료가 넘치는데 그래도 진행할거냐? 물어본다 -명시적 형변환(큰 자료형 -> 작은 자료형)
                                //()안에 자료형을 입력하여 자바에서 명시해준다.
        System.out.println(num2);


        double num3 = 3.14;
        int num4 = (int)num3;
        System.out.println(num4);
    }
}
