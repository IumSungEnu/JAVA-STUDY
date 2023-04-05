package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Ex02 { //Class getClass - 클래스 슬래스 객체(정적 변수)
    public static void main(String[] args){
        Class<Student> cls = Student.class;

        //Student s1 = new Student(1000,"이이름");
        //Class cls2 = s1.getClass();

        Field[] fields = cls.getFields();
        for(Field field : fields){
            System.out.println(field);
        }

        Constructor[] cons = cls.getConstructors();
        for(Constructor con : cons){
            System.out.println(con);
        }
    }
}
