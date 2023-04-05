package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {  //List로 저장할 경우
    public static void main(String[] args){

        List<Book> books = new ArrayList<>();  //책 10권을 한꺼번에 저장
        for(int i = 1; i <= 10; i++){
            Book book = new Book(i, "책" + i, "저자" + i);
            books.add(book);
        }

        try(FileOutputStream fos = new FileOutputStream("books.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(books);

        }catch (IOException e){
            e.printStackTrace();
        }
    }//main
}
