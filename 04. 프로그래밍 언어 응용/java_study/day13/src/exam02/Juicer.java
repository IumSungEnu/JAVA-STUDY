package exam02;

public class Juicer<T> {
    private T items; //Juicer<T>와 T변수는 다르다.

    //private T[]
    //private static T staticItem; // static 자원은 처음부터 자료형이 결정 -> 사용 불가

    public void setItems(T t){ //지네릭 클래스 T

    }
    public <T> void getItems(T t){ //지네릭 메서드 T

    }
    //지네릭 클래스 선언
    /*public static void make(Box<? extends Fruit> box){ //재료
                                         // ? -> Object : 투입된 것이 모두 Object이기 때문에
                                         // Ex03의 예제처럼 사과주스나 오렌지주스의 값이 모두 출력된다.
                                         // 상한 제한 <? extends Fruit> (위 -> 아래로 ↓)
                                         // 하한 제한 <? super Fruit> -> Apple, Fruit, Object(아래 -> 위 ↑)
        Fruit fruit = (Fruit)box.getItem();
        System.out.println(fruit.getItemNm() + "주스");
    }*/

    // ↓  짧게 선언할수 있다.

    //지네릭 메서드 선언
    public static <T extends Fruit> void make(Box<T> box){
        T fruit = box.getItem();
        System.out.println(fruit.getItemNm() + "주스");
    }
}
