package exam04;

import static java.lang.Math.*; //Math.abs(-100);에서 Math 생략가능
public class Ex01 {
    public static void main(String[] args){
        System.out.println(abs(-100)); //음수를 양수를 바꾸는 절대값
        System.out.println(pow(2,3));
        System.out.println(ceil(10.2));
        System.out.println(round(10.6));
        System.out.println(floor(9.7));

        double num = random(); //무작위로 실행 (0.0 ~ 0.9 범위 내에서 무작위 실행)
        System.out.println(num);

        //random()은 곱한 값에서 -1한 값을 출력해준다.
        //double num2 = random() * 10; //0 ~ 9 사이 범위
        int num2 = (int)(random() * 10);
        System.out.println("num2 = " + num2);
        int num3 = (int)(random() * 3); //0 ~ 2
        System.out.println("num3 = " + num3);
    }//main
}
