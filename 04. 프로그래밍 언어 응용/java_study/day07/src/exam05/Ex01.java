package exam05;

public class Ex01 {  //인스턴스 내부 클래스
                     //(외부클래스 안에 내부클래스가 있어야지 객체 생성이 가능하다)
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.innerNum);
        inner.innerMethod();

        Outer.Inner.staticNum = 10;

    }
}
