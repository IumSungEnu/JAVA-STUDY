package exam01;

import java.io.*;

public class Ex05 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            // AutoCloseable - close()

            // 예외 발생 가능성있는 코드
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
