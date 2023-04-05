package exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {
    public static void main(String[] args){
        try(FileOutputStream fos = new FileOutputStream("test4.txt")){
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            //한글은 2바이트 유니코드기 때문에 깨진다.
            //0~250까지 수용할수 있는데 위에 예제처럼 '안'이라는 글자는 50529라는 큰 숫자를 가지고 있기 때문이다.

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
