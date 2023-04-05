package exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex04 {
    public static void main(String[] args){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(2000));
        apples.add(new Apple(1000));
        apples.add(new Apple(3000));
        apples.add(new Apple(5000));


        Comparator<Fruit> fruitDesc = new Comparator<>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };

        // ? extends Friue - ? -> Apple, Friue, Orange, ...
        // ? super Apple - ? -> Apple, Friue, Object

        Collections.sort(apples, fruitDesc); // 구현된 appleDesc 객체를 넣음
        // ? super Apple - ? -> Apple, Fruit, Object

        for(Apple apple : apples){
            System.out.printf("%s=%d%n", apple.getItemNm(), apple.getPrice());
        }


        List<Orange> oranges = new ArrayList<>(); //? super Orange -> ? - Orange, Fruit, Object
        oranges.add(new Orange(2000));
        oranges.add(new Orange(1000));
        oranges.add(new Orange(3000));
        oranges.add(new Orange(5000));

        Collections.sort(oranges, fruitDesc);  //? super Orange -> ? - Orange, Fruit, Object

        for(Orange orange : oranges){
            System.out.printf("%s=%d%n", orange.getItemNm(), orange.getPrice());
        }


    }//main
}
