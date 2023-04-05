package exam01;

public class Ex01 {  //동일성
    public static void main(String[] args){
        Student s1 = new Student(1000,"이이름");
        Student s2 = new Student(1000,"이이름");
        System.out.println("s1.hashCode() : " + s1.hashCode());
        System.out.println("s2.hashCode() : " + s2.hashCode());
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + (s1.equals(s2)));


        //System.out.println(s1.toString());  // Object에 있는 toString() 호출
                                            // toString()은 없어도 호출이 가능하다.
    }
}
