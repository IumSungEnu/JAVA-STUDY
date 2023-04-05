package exam02;

import java.io.Serializable;

public class Book implements Serializable {  //마커 인터페이스 Serializable -> 비어있는 객체
    private int id;
    private String title;  //제목
    private int price;  //가격(추가했을 때)
    private transient String author;  //저자
    //transient : 직렬화 배재 - null
    private static final long serialVersionUID = 1L;  //동일한 버전으로 저장(고정함)
                                                      //변화가 커서 호환이 안될때 버전을 다시 만든다.

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
