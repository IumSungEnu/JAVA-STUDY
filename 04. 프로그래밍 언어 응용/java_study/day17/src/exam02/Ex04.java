package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("test2.txt")){
            int i = 0;
            while ((i = fis.read()) != -1){
                System.out.print((char) i);
                //한글 깨짐이 출력됨.
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}
