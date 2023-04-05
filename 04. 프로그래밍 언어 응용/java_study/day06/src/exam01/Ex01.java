package exam01;

public class Ex01 {
    public static void main(String[] args){
        //B b = new B();
        //System.out.println(b.numA);

        C c = new C();
        A a = c;  // C -> A(상위클래스로 바뀔수 있다 - 다형성)
        B b = c;  // C -> B
        // 예)오렌지주스를 예로 들면 C안에 A와 B라는 작은 컵들이 들어있는데 내용물은 오렌지주스로
        // 명백하게 예측할수 있다.
        // 하지만 내용물은 같지만 사이즈는 각각 다르다.

    }
}
