package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        //char ch = (char)System.in.read();  //입력될때까지 기다린다.
                                           //1바이트씩 읽기 때문에 1문자만 출력된다.
        // blocking
        //System.out.println(ch);
        //           ↓  문자를 한꺼번에 출력하고 싶을때(①한글은 깨짐)
        System.out.println("문구를 입력하세요");
        InputStreamReader isr = new InputStreamReader(System.in);  //①한글깨짐 방지(한글 별도처리)
        BufferedReader br = new BufferedReader(isr);  //②버퍼
        while (true){
            //char ch = (char)System.in.read();
            //char ch = (char)isr.read(); //①한글깨짐을 막기위해 바꾼다.
            String line = br.readLine();  //②버퍼
            //System.out.print(ch);
            System.out.print(line);  //②버퍼
        }
    }
}
//①을 사용하여 한글을 작성할 수 있습니다. 그런데 한글을 쓰는데 기능이 뭔가 안좋은듯 하다...
//그럴경우 ②를 사용하여 기능적으로 좋게 만들어준다.
