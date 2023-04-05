package exam03;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args){
        Class cls = Ex03.class;
        MyAnno2 anno2 = (MyAnno2)cls.getAnnotation(MyAnno2.class);
        String[] value = anno2.value();
        int max = anno2.max();
        int min = anno2.min();

        System.out.println(Arrays.toString(value));
        //System.out.printf("value=%s%n", value);
        System.out.printf("max=%d%n", max);
        System.out.printf("min=%d%n", min);
    }
}
