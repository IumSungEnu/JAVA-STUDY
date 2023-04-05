package exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args){ //새로운 파일을 생성하여 A ~ Z까지 저장
        try(FileOutputStream fos = new FileOutputStream("test3.txt")){
            for(char ch = 'A'; ch <= 'Z'; ch++){
                fos.write(ch);
                System.out.print(ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
