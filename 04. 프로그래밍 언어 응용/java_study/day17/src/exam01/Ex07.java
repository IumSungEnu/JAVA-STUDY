package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex07 {  //.groupingBy()
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(3,'F',"이름1"));
        students.add(new Student(2,'M',"이름2"));
        students.add(new Student(1,'F',"이름3"));
        students.add(new Student(3,'M',"이름4"));
        students.add(new Student(2,'F',"이름5"));

        Map<Integer, List<Student>> students2 = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));

        List<Student> grade1 = students2.get(1);
        List<Student> grade2 = students2.get(2);
        List<Student> grade3 = students2.get(3);

        System.out.println(grade1);
        System.out.println(grade2);
        System.out.println(grade3);
    }
}
