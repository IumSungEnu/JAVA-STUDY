package exam03;

import java.io.*;

public class Ex03 { //파일 복사 - Buffer -> 시간단축
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        try(FileInputStream fis = new FileInputStream("docs.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("copied2_docs.zip");
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            int i = 0;
            while ((i = bis.read()) != -1){
                bos.write(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("걸린시간 : %d%n", endTime, startTime);
    }
}
