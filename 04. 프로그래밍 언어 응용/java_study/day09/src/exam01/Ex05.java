package exam01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("a.txt");
            BufferedInputStream bis = new BufferedInputStream(fis)){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
