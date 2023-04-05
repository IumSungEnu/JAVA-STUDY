package exam01;

public class Ex01 {
    public static void main(String[] args){  // main()은 모든 코드의 시작점
        int num1 = 10;
        int num2 = 20;

        int result = add(num1, num2);

        System.out.println(result);

        final  int MAX_NUM = 10;

    }

    static  int add(int num1, int num2){  // 함수 지역
        // 함수는 static이 있어야 수행할수 있다.
        int result = num1 + num2;  // 지역변수 - 함수가 수행될때 공간 o
        System.out.println("함수1 호출");
        return result;
    }
    static float add(float num1, float num2){
        System.out.println("함수2 호출");
        return num1+num2;
    }

//    static  int add(float num1, float num2){  // 동일한 명칭의 함수명을 사용해도 매개변수가
//                                              // 다르면 사용이 가능하다.
//        return 0;
//    }


    static  void  print(String str){
        System.out.println(str);
        //return; -> void가 있으면 생략가능

    }//main
}
