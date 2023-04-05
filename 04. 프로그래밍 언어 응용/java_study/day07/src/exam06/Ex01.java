package exam06;

public class Ex01 { //정적 내부 클래스
    public static void main(String[] args){
        Outer.Inner inner = new Outer.Inner();
        inner.innerMethod();
    }
}
