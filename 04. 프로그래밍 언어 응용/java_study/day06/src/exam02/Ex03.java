package exam02;

public class Ex03 {
    public static void main(String[] args) {  //Ex02와 동일한 배열(짧게 쓰는 예)
        Animal[] animals = {new Human(), new Taiger(), new Bird()};

        for(Animal animal : animals){
            animal.move();
            if(animal instanceof Human){
                Human human = (Human)animal;
                human.readBook();
                System.out.println("------------------------");
            } else if (animal instanceof Taiger) {
                Taiger taiger = (Taiger)animal;
                taiger.hunting();
                System.out.println("------------------------");
            } else if(animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.hetch();
            }
        }
    }
}
