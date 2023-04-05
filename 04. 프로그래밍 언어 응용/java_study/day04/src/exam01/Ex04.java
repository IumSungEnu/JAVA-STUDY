package exam01;

import exam02.A;

public class Ex04 {
    public static void main(String[] args){
        A a = new A();
        //a.numA = 10; // 다른 패키지에 있기 때문에 불러올수 없다(default 디폴트)
        a.numB = 10;  //public은 다른 패키지여도 불러올수 있다(퍼블릿)
    }
}
