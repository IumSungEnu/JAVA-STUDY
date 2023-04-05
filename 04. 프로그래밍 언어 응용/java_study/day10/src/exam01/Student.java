package exam01;

import java.util.Objects;

public class Student {
    private int id; //학번
    private String name; //이름
    
    public Student(int id, String name){  //id,name 생성자
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) { //재정의(동등성 비교)
                                        //Object obj = new Student()
        if(obj instanceof Student){
            Student s = (Student)obj;
            if(s.id == id && s.name.equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {  //중복 제거
        return Objects.hash(id, name); //id, name 같으면 같은 해시코드
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
