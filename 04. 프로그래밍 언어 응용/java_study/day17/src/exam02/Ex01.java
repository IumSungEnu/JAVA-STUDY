package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {  //입출력(I/O)
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("test.txt ")){
            /*
            int ch = fis.read(); //1바이트를 읽어온다
            System.out.println((char)ch); //(char)ch로 형변환을 해야 A가 출력된다. 그렇지 않으면 숫자 65가 나온다.

            int ch2 = fis.read();
            System.out.println((char)ch2);

            int ch3 = fis.read();
            System.out.println((char)ch3);

            int ch4 = fis.read();
            System.out.println((char)ch4);

            int ch5 = fis.read();
            System.out.println(ch5);  //문자일때 ㅁ, 숫자일때 -1
            */

            /*
            int i = 0;
            while ((i = fis.read()) != -1){
                System.out.print((char) i);
            }
            */

            while (fis.available() > 0){
                int i = fis.read();
                System.out.print((char)i);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}
