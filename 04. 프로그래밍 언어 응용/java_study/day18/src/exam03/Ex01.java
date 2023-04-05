package exam03;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args){
        try (FileWriter fw = new FileWriter("test5.txt", true)){  //append :기존의 데이터에 추가되어 출력된다.
            fw.write("안녕하세요.\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}
