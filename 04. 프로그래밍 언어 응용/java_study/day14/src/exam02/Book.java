package exam02;

import java.util.Objects;

public class Book  implements Comparable<Book>{
    private String title;  //책 제목
    private String author;  //저자
    private String publisher;  //출판서
    private int price;  //책값

    public Book(String title, String author, String publisher, int price) {  //기본생성자 추가
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    //Ex02의 HashSet
    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher, price);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            Book book = (Book)obj;
            if(title.equals(book.title) && author.equals(book.author) &&
                    publisher.equals(book.publisher) && price == book.price){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {   //toString() 추가
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {  //정렬 기준 compareTo

        //return price - o.price; //오름차순 가격정렬
        //return o.price - price;  //내림차순 가격정렬
        
        //return title.compareTo(o.title);  //책 제목으로 오름차순 정렬
        //return o.title.compareTo(title);  //책 제목으로 내림차순 정렬
        return title.compareTo(o.title) * -1;  //책 제목으로 내림차순 정렬
    }
}
