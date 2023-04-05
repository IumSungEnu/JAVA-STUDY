package exam01;

public class Ex01 {
    public static void main(String[] args){
        /*Student s1 = new Student();
        s1.setId(1);
        s1.setName("이름1");
        s1.setSubject("과목1");
        System.out.println(s1);
         */

        /*
        //@Builder 사용한 경우
        Student s1 = Student.builer()
                            .id(1)
                            .name("이름")
                            .subject("과목")
                            .build();
        System.out.println(s1);
         */


        /*
        //@AllArgsConstructor 사용한 경우
        Student s1 = new Student(1,"이름1", "과목1");
        System.out.println(s1);
         */

        //@RequiredArgsConstructor 사용한 경우 - final, NonNull만 가능
        Student s1 = new Student(1, "이름");
        System.out.println(s1);
    }
}
