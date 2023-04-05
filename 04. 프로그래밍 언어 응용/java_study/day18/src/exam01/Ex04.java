package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("test3.txt");
            DataInputStream dis = new DataInputStream(fis)){
                //read자료형, readUTF() : 문자열
                byte num1 = dis.readByte();
                //int num1 = dis.readByte(); -> 자료를 읽는것이기 때문에 int로 작성하여도 문제는 없다.
                double num2 = dis.readDouble();
                //int num2 = (int)dis.readDouble(); -> Double인 경우 int로 형변환을 해줘야한다.
                String str = dis.readUTF();
                //int num3 = dis.readByte(); //EOFException 오류발생

                System.out.printf("num1=%d%n", num1);
                System.out.printf("num2=%f%n", num2);
                System.out.printf("str=%s%n", str);
                
        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}//결과값은 순서대로 읽는다. 데이터 그대로를 읽어오기 때문에 순서가 바뀌면 오류발생
//자료형도 마찬가지로 동일한 자료형으로 작성해야 오류가 안뜬다. 다르게 쓸경우 오류
