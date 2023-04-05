package exam02;

import java.io.IOException;
import java.io.StringReader;

public class Ex06 { //메모리 기반 StringReader
    public static void main(String[] args) throws IOException {
        StringReader sr = new StringReader("안녕하세요.");
        int i = 0;
        while ((i = sr.read()) != -1){
            System.out.print((char)(i));
        }
    }//main
}
