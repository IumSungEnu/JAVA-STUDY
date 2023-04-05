package exam03;

public class Ex01 {
    public static void main(String[] args){
        Student s1 = new Student(1000,"이름1");
        System.out.println(s1); //s1.toString()

        Student s2 = new Student(1000, "이름1");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        //Object   //Ctrl + 마우스 왼쪽버튼 (오브젝트 호출)
    }//main
}
