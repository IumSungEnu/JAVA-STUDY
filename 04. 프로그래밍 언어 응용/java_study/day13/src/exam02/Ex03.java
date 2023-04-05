package exam02;

public class Ex03 {
    public static void main(String[] args){
        Box<Apple> appleBox = new Box<>();
        Apple apple = new Apple(); //Apple, Fruit, Object
        appleBox.setItem(apple);
        Juicer.make(appleBox);

        Box<Fruit> orangeBox = new Box<>();  //Oranfe, Fruit, Object
        orangeBox.setItem(new Orange());
        Juicer.make(orangeBox);
    }
}
