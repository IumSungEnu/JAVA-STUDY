package exam01;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex04 {  //Collectors - 컬렉션 편의 기능
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(3,'F',"이름1"));
        students.add(new Student(2,'M',"이름2"));
        students.add(new Student(1,'F',"이름3"));
        students.add(new Student(3,'M',"이름4"));
        students.add(new Student(2,'F',"이름5"));

        List<String> names = students.stream().map(Student::getName).toList();
        System.out.println(names);

        Set<Integer> grades = students.stream().map(Student::getGrade).collect(Collectors.toSet());
        System.out.println(grades);

        Map<String, Student> stus = students.stream()
                .collect(Collectors.toMap(Student::getName, Function.identity()));
        System.out.println(stus);

        String[] names2 = students.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(names2));

        ArrayList<String> names3 = students.stream().map(Student::getName)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(names3);
    }//main
}
