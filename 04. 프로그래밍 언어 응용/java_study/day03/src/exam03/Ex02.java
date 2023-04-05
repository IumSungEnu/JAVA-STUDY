package exam03;

public class Ex02 {
    public static void main(String[] args){

        int n1 = 10;
        int n2 = 20;
        int r = add(10,20);
        //System.out.println(r);

    }//main

    //정의한 함수 코드
    static  int add(int num1, int num2){ //int num1 = 10, int num2 = 20;
        int result = num1 + num2;

        return result;   //결과를 밖으로 반환한다.(반환값) -> 반환도 되지만 함수를 끝낸다.
    }
}
