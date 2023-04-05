package exam;

public class Ex20 {
    public static void main(String[] args){
        //while문  - 조건식이 false가 나오면 그냥 끝이난다.
        int total = 0;
        int num = 1;  // 1, 2, 3, ... 100

        while(num <= 100){
            //total = total + num
            total += num;

            //num = num + 1;
            num++;   //1씩 증가

        }
        System.out.println("total: " + total);
    }
}
