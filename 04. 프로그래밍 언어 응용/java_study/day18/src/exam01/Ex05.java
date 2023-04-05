package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args){

        int[] scores = {90,88,100,55,70};

        try(FileOutputStream fos = new FileOutputStream("test4.txt");
            DataOutputStream dos = new DataOutputStream(fos)){

            for(int score : scores){
                dos.writeInt(score);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }//main
}
