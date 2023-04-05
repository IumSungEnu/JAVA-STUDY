package exam02;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class Ex12 { //메서드 참조2
    public static void main(String[] args){
        Book book = new Book("책1");
        //Consumer<Book> func1 = b -> b.printInfo(b);
        Consumer<Book> func1 = book::printInfo; //Book에서 매개변수 book을 지정해줘야 한다.
        func1.accept(book);

        //Supplier<Book> func2 = () -> new Book("책2");
        Supplier<Book> func2 = Book::new;  //기본생성자를 생성해야 Book 가능

        //IntFunction<int[]> func3 = i -> new int[i]; // i번째 배열을 선언하면 i번째까지 저장할수 있다.
        IntFunction<int[]> func3 = int[]::new;
        int[] nums = func3.apply(10);
        System.out.println(Arrays.toString(nums));


    }//main
}
