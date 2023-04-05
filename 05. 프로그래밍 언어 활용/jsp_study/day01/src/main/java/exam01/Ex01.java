package exam01;

public class Ex01 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("이름");
        s1.setSubject("과목1");

        System.out.println(s1);  //s1.toString()
    }
}
