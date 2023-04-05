package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];  //배열공간(new 생성자x)
        animals[0] = new Human();
        animals[1] = new Taiger();
        animals[2] = new Bird();

        for(Animal animal : animals){
            animal.move();
        }
    }
}
