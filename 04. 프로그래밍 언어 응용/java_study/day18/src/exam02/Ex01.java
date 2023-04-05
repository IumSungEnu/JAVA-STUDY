package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01 { //ObjectOutputStream
    public static void main(String[] args){
        Book book1 = new Book(1,"책1","저자1");
        Book book2 = new Book(2,"책2","저자2");

        try(FileOutputStream fos = new FileOutputStream("book.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            //writeObject
            oos.writeObject(book1); //NotSerializableException -> 오류발생
            oos.writeObject(book2);

            oos.writeObject(new String("abc"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}
