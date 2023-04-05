package exam01;

public class Ex03 {
    public  static  void main(String[] args){
        Student s1 = new Student();
        s1.showInfo();

        Student s2 = new Student(1001,"이름2", "과목2");
        s2.showInfo();
    }
}
