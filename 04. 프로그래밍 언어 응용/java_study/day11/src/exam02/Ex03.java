package exam02;

public class Ex03 {
    public static void main(String[] args){
        //new 생성자x - 주소가 달라지기 때문에(JDK11버전 이후부터 사용)
        Integer num1 = Integer.valueOf("10");  //valueOf를 사용하면 주소값이 같다.
                                                  //"문자"로 입력해도 같은 값이 출력된다.(변환기능도 추가되있다)
        Integer num2 = Integer.valueOf(10);
        System.out.println(System.identityHashCode(num1));
        System.out.println(System.identityHashCode(num2));

        int num3 = Integer.parseInt("10");
        System.out.println(num3 + 20);
    }
}
