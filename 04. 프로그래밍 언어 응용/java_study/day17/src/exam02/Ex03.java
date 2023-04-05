package exam02;

import java.io.ByteArrayInputStream;

public class Ex03 {
    public static void main(String[] args){
        String alpha = "ABCDEFG";  //데이터의 출처만 다르고 방식은 같다.
        byte[] data = alpha.getBytes();

        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int i = 0;
        while ((i = bis.read()) != -1){
            System.out.print((char)i);
        }
    }//main
}
