package exam02;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args){
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("책1", "저자1","출판사1",10000));
        books.add(new Book("책4", "저자4","출판사4",40000));
        books.add(new Book("책2", "저자2","출판사2",20000));
        books.add(new Book("책3", "저자3","출판사3",30000));
        books.add(new Book("책2", "저자2","출판사2",20000));

        for(Book book : books){
            System.out.println(book);
        }
    }
}
