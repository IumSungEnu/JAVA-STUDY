package exam04;

public class Ex10 {
    public static void main(String[] args){
        String str = String.format("%s님 안녕하세요.", "이름");
        System.out.println(str);
        int num1 = 10;
        int num2 = 20;
        String str2 = String.format("%d + %d = %d %n", num1, num2, num1 + num2);
        System.out.println(str2);
    }
}
