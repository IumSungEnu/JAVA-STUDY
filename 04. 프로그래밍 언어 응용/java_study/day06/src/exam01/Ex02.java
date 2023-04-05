package exam01;

public class Ex02 {
    public static void main(String[] args){
        A a = new C(); //C c = new C();
                       //A a = c;

        A ad = new D(); //D d = new D();
                        //A ad = d;

        if(ad instanceof C){  //instanceof
            C c = (C)ad;
        }
    }
}
