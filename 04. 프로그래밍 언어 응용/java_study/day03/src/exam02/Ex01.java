package exam02;

public class Ex01 {
    public static void main(String[] args){
        int[] students = new int[100];   //students라는 int 변수가 100개 만들어 졌다.
        for (int i = 0; i<= 99; i++){
            students[i] = i + 1000;
        }

        for (int i=0; i<=99; i++){
            System.out.println("학생" + (i+1) + ", 학번" + students[i]);
        }

    }//main
}
