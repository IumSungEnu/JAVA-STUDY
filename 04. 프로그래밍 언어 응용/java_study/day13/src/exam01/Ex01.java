package exam01;

public class Ex01 {
    public static void main(String[] args){
        Box box = new Box();
        Box box2 = new Box();
        Apple apple = new Apple();  //Object
        Toy toy = new Toy();  //Object

        box.setItem(apple);
        box2.setItem(toy);

        //반환값
        Object apple2 = box.getItem();
        if(apple2 instanceof Apple){
            Apple app = (Apple)apple2;
        }

    }//main
}
