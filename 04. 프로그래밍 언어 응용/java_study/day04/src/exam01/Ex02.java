package exam01;

public class Ex02 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "이름1";
        s1.subject = "과목1";
        s1.showInfo();

        //System.out.println(s1);
        //System.out.println(System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "이름2";
        s2.subject = "과목2";
        s2.showInfo();


        //s3에 값을 입력해 바꾸면 s2도 함께 바뀌어져 있다.
        Student s3 = s2;
        s3.id = 1002;
        s3.name = "이름3";
        s3.showInfo();

        s2.showInfo();
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
    }
}
