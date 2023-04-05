package exam04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력 : 형식) 숫자1 숫자2 연산자(+)");
        String input = sc.nextLine();  //입력을 받을때까지 멈춘다(블록킹)
        System.out.println(input);
        String[] nums = input.split(" ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        char opr = nums[2].charAt(0);
        int total = 0;
        switch (opr){
            case '+':
                total = num1 + num2;
                break;
            case '-':
                total = num1 - num2;
                break;
            case '*':
                total = num1 * num2;
                break;
            case '/':
                total = num1 / num2;
                break;
        }
        System.out.println(total);
    }
}
