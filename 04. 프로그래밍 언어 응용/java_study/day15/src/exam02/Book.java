package exam02;

public class Book {
    private String title;

    public Book(){}

    public Book(String title){
        this.title = title;
    }

    public void printInfo(Book book){
        System.out.println(book.title);
    }
}
