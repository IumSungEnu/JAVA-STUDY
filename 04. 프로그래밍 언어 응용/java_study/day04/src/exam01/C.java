package exam01;

import exam02.B;

public class C extends B {   //extends로 상속시켜 패키지B에서 접근가능하다.
    public C(){
        numB = 20;
        System.out.println(numB);
    }
}
