package exam;

public class Ex10 {
    public static void main(String[] args){
        int num = 100;
        int num2 = -num;  // -100
        System.out.println(num2);

        int num3 = -num2; // 100  
        System.out.println(num3);
        
        int num4 = 13;
        if(num4 % 2 == 1){
            System.out.println("홀수");
        }
    }
}
