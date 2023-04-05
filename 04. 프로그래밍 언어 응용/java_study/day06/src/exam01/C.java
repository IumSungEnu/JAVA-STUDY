package exam01;

public class C extends B{
    int numC = 30;
    
    public C(){  //기본생성자
        super(); //B();
        System.out.println("C 생성자");
    }
}
