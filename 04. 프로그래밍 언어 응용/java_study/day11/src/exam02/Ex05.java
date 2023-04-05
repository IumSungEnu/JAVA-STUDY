package exam02;

public class Ex05 {
    public static void main(String[] args){
        int num1 = 100;
        Integer num2 = Integer.valueOf(200);
        int num3 = num1 + num2;   //num2.intValue(); -> 언박싱 (연산은 기본만 된다)
        //과거에는 안되는 식이었는데 가능하게 됨

        Integer num4 = Integer.valueOf(100);
        Integer num5 = Integer.valueOf(200);

        int num6 = num4 + num5; //num4.intValue() + num5.intValue();

        Integer num7 = 100 + 200;  //300 -> Integer.valueOf(300);
    }//main
}
