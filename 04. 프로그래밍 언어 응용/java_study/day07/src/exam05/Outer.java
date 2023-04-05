package exam05;

public class Outer { //외부 클래스가 만들어 져야만 내부 클래스 생성이 가능하다.
    class Inner{  //Outer -> Inner
        static  int staticNum = 10;
        int innerNum = 10;
        void innerMethod(){
            System.out.println("인스턴스 내부 클래스");
        }
    }
}
