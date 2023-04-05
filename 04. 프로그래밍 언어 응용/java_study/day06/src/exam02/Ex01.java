package exam02;

public class Ex01 {
    public static void main(String[] args){
        //Animal이라는 공통적인 자료형이 담겨져있다.
        Human human = new Human();  //Animal, Human(다형성)
        //human.move();  //결과값 : 움직인다.

        Taiger taiger = new Taiger();  //Animal, taiger(다형성)
        //taiger.move(); //결과값 : 움직인다.

        Bird bird = new Bird();  //Animal, bird(다형성)
        //bird.move();  //결과값 : 움직인다.

        //Animal를 이용하여 배열로 정의할수 있다.
        Animal[] animals = new Animal[3]; //0,1,2
        animals[0] = human;  //Animal animal = human
        animals[1] = taiger; //Animal animal = taiger
        animals[2] = bird;   //Animal animal = bird

        for(Animal animal : animals){
            animal.move();
        }
    }
}
