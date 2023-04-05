package exam06;

public class Outer { //외부 클래스의 객체 생성과 상관없이 사용가능
    int outerNum = 10;
    static int outerNum2 = 20;
    static void StaticMethod(){}

    static class Inner{
        int innerNum = 10;
        void innerMethod(){
            //outerNum = 20;  //오류
            outerNum2 = 20;
            StaticMethod();
            System.out.println("정적 내부 클래스");
        }
    }
}
