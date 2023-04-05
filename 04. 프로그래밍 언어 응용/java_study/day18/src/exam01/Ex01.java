package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {  //InputStreamReader 방식의 한글깨짐 방지
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis)){

            int i = 0;
            while ((i = isr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}
