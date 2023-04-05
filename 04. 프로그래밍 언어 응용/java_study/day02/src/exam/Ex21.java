package exam;

public class Ex21 {
    public static void main(String[] args){
        // do ~ while문  - 조건이 false여도 조건식이 아래에 있어 나중에 실행되기 때문에 결과값이 나온다.
        // 거짓이 나와도 한번은 실행된다.
        int num = 1;
        int total = 0;

        do{
            total += num;  // total = total + num;
            num++;  // num = num + 1;

        } while (num < 1);  //false

        System.out.println("total: " + total);
    }
}
