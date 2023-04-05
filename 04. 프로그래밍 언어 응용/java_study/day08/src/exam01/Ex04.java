package exam01;

import java.io.*;

public class Ex04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a2.txt");

        } catch (IOException e) {
            e.printStackTrace();
        } finally { // 예외가 발생하든 안하든 무조건 실행되는 영역
            try {
                fis.close();
            } catch(IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
