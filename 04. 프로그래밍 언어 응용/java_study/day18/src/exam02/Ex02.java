package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex02 {  //book.obj 복구
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("book.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            try {
                Book book = (Book) ois.readObject();
                System.out.println(book);

                Book book2 = (Book) ois.readObject();
                System.out.println(book2);

                String str = (String) ois.readObject();
                System.out.println(str);
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
