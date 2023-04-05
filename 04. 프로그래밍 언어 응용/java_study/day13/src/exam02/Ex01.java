package exam02;

public class Ex01 {
    public static void main(String[] args){
        Box<Apple> box = new Box<Apple>();
        //Box<Fruit> box2 = new Box<Fruit>();
        Apple apple = new Apple();
        box.setItem(apple);

        Apple apple2 = box.getItem();
        System.out.println(box);
    }//main
}
