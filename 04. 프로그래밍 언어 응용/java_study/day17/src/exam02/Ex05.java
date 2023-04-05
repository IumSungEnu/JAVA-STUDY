package exam02;

import java.io.FileReader;
import java.io.IOException;

public class Ex05 { //FileReader
    public static void main(String[] args){
        try(FileReader fr = new FileReader("test2.txt")){
            int i = 0;
            while ((i = fr.read()) != -1){
                System.out.print((char)i); //한글깨짐 없음
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
