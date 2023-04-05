package exam01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("test4.txt");
            DataInputStream dis = new DataInputStream(fis)){

            int total = 0;
            try {
                while (true) {
                    int score = dis.readInt();
                    //System.out.println(score);
                    total += score;
                }
            }catch (EOFException e){ //파일 읽기 끝
                System.out.printf("합계 : %d%n", total);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}
