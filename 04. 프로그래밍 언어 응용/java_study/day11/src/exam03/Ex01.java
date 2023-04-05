package exam03;

public class Ex01 { //class 클래스
    public static void main(String[] args){
        Class cls = Person.class;

        Person person = new Person(30,"이이름");
        Class cls2 = person.getClass();
    }//main
}
