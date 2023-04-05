package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex04 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("books.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            List<Book> books = (List<Book>) ois.readObject();

            for(Book book : books){
                System.out.println(book);
            }

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }//main
}
