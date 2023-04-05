package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex06 { // partitioningBy()
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(3,'F',"이름1"));
        students.add(new Student(2,'M',"이름2"));
        students.add(new Student(1,'F',"이름3"));
        students.add(new Student(3,'M',"이름4"));
        students.add(new Student(2,'F',"이름5"));

        //성별로 구분
        Map<Boolean, List<Student>> students2 = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGender() == 'F'));

        List<Student> females = students2.get(true);
        List<Student> males = students2.get(false);
        System.out.println(females);
        System.out.println(males);
    }
}
