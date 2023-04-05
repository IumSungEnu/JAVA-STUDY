package exam01;

import java.io.*;

public class Ex02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            // throw new FileNotFoundException("메세지");

        } catch (FileNotFoundException e) {
            System.out.println("오류 처리....");
            //e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);
        }

       System.out.println("중요한 실행 코드!");
    }
}
