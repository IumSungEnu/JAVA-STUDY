package exam01;

public class B extends A{
    int numB = 20;

    public B(){  //기본생성자
        super(); //A();
        System.out.println("B 생성자");
    }
}
