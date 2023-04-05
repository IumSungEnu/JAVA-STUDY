package exam02;


public class Ex01 {
    public static void main(String[] args){
        //지역 내
        Calculator cal = new Calculator() {

            //함수가 코드에 들어가기 때문에 객체가 안된다.
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };

        int result = cal.add(10,20);
        System.out.println(result);


        //위 코드를 람다식으로 표현 '->'
        //람다식을 최대한 짧게 -> 한정적이어서
        Calculator cal2 = (a, b) -> a + b; //구현체가 1줄일 경우 {}도 생략이 가능하다.
                                           //매개변수나 반환값으로도 짧게 줄여서 쓸수 있다. 'a, b'
        int result2 = cal2.add(20,30);
        System.out.println(result2);

    }//main
}
