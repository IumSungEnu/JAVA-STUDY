package exam01;

public class Ex02 {
    public static void main(String[] args){  //set을 대체한다.
        Student s1 = Student.builder()
                            .id(1)
                            .name("이름1")
                            .subject("과목1")
                            .build();
        System.out.println(s1);
    }
}
