package exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 { //파일 복사
    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); //1970.1.1 자정부터 1/1000초씩 카운팅한 숫자 - EpochTime

        try(FileInputStream fis = new FileInputStream("docs.zip");
            FileOutputStream fos = new FileOutputStream("copied_docs.zip")){

            int i = 0;
            while ((i = fis.read()) != -1){
                fos.write(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("걸린시간 : %d%n", endTime, startTime);
    }
}
