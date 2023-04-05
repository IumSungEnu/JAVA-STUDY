package exam02;

import exam01.A;
import exam01.C;
import exam01.D;

public class Ex04 {
    public static void main(String[] args) {
        //C c = new C();
        //A a = c;
        A a = new C();   //A <- B <- C (동일한 A라는 이름의 클래스로 정의하지만
                         //             아래 A객체와 출처가 다르다)
        A ad = new D();  //A <- D
    }
}
