package exam03;

public class Ex01 {
    public static void main(String[] args){
        Student student = new Student();   //객체 생성
        //id, name, subject -> 메모리 공간이 할당 -> 변수로서 역할 O
        student.id = 1000;
        student.name = "이름1";
        student.subject = "과목1";   //변수에 값 대입(메모리가 있다 -> 객체가 생성되어 있다.)

        student.study();  //클래스 안에 함수가 정의 되있기 때문에 멤버함수/멤버메소드라고도 한다.

    }
}
