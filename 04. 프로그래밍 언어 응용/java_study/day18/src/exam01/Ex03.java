package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {  //
    public static void main(String[] args){
        try(FileOutputStream fos = new FileOutputStream("test3.txt");
            DataOutputStream dos = new DataOutputStream(fos)){
            //write자료형, writeUTF : 문자열
            dos.writeByte(100);
            dos.writeDouble(10.123);
            dos.writeUTF("안녕");

        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}//결과값으로 test3.txt파일 생성됨, 순서대로 정렬되어 저장, 오류가 뜬다.
