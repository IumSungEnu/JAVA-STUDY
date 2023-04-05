package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex02 {  //OutputStreamWriter 방식의 한글깨짐 방지
    public static void main(String[] args){
        try(FileOutputStream fos = new FileOutputStream("test2.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos)){
            int i = 0;
            osw.write("안녕하세요.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}
