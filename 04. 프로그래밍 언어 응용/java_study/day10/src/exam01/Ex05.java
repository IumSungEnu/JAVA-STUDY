package exam01;

import java.util.HashSet;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {  //중복 제거 X
        Set<Student> students = new HashSet<>();
        students.add(new Student(1000, "학생1"));
        students.add(new Student(1000, "학생1"));
        students.add(new Student(1001, "학생2"));
        students.add(new Student(1002, "학생3"));

        for(Student s : students){
            System.out.println(s);
        }
    }
}
