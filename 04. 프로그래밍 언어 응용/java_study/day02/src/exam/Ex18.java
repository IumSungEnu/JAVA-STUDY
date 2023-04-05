package exam;

public class Ex18 {
    public static void main(String[] args){
        // 삼항 연산자
        // 조건식 ? 참일때 : 거짓일때
        char gender = 'F';

        String str = gender == 'F' ? "여성" : "남성";
        System.out.println("성별: " + str);

    }
}
