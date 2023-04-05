package exam02;

public class Student {
    static int id;
    String name;
    String subject;

    @Override
    public String toString() {
        return "Student{" +
                "id= '" + id + "' " +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    void instanceMethod(){
        System.out.println("인스턴스 메서드");
        id = 2000;
        staticMethod();
    }
    static  void staticMethod(){  // 객체 생성과 상관x
        System.out.println("static 메서드");
        //this를 사용할 수 없다.
        //this.name = "이름2";
        //this.instanceMethod();
    }
}
