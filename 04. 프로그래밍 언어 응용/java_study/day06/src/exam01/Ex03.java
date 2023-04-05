package exam01;

public class Ex03 {
    public static void main(String[] args){

        A a = new C();

        C c  = (C)a;  //명시적 형변환

        //D d = new D();
        A ad = new D();

        if(ad instanceof C) {
            C ac = (C) ad;  // D는 C가 아니기 때문에 문제가 발생한다(출처가 다르다)
        }
    }
}

