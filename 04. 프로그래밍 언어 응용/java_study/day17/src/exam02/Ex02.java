package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("test.txt")){  //파일
            byte[] buffer = new byte[5];
            while (fis.available() > 0){
                int len = fis.read(buffer);  //읽어온 바이트 수
                //System.out.println(Arrays.toString(buffer));
                /*
                for(byte b : buffer){
                    System.out.print((char)b);
                }*/
                for(int i = 0; i < len; i++){
                    System.out.print((char)buffer[i]);
                }
                System.out.println();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
