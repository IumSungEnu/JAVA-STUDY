package exam04;

public class Ex11 {
    public static void main(String[] args){
        System.out.println("줄개행");
        System.out.println("줄개행");

        System.out.println("-----------------------------");

        System.out.print("줄개행 없음");
        System.out.print("줄개행 없음");
        System.out.print("줄개행 없음");

        System.out.println("-----------------------------");

        System.out.println(); // \n
        System.out.printf("%s님 안녕하세요.%n", "이이름");

        int num1 = 10;
        int num2 = 20;
        System.out.printf("%d + %d = %d %n", num1, num2, num1 + num2);
    }
}
