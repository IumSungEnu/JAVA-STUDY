package exam01;

public class Ex04 {
    public static void main(String[] args){
        //구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스
        for(int i=2; i <= 9; i++){
            if(i%2 == 0){  // 짝수 단을 건너뛰면 홀수 단
                continue;
            }
            System.out.println("==== " + i + "단" + " ====");
            for(int j = 1; j <=9; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}
