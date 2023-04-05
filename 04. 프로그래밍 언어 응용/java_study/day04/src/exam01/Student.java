package exam01;

public class Student {
    int id;  //학번
    String name;  //이름
    String subject;  //전공과목

   public Student(){  //기본 생성자
        // 객체가 생성된 이후에 작업할 부분
        // 주로 하는 작업 : 생성된 객체의 멤버 변수 초기화
        id = 1000;
        name = "학생1";
        subject = "과목1";
    }
    public Student(int _id, String _name, String _subject){
        id = _id;
        name = _name;
        subject = _subject;
    }

    void showInfo(){
        System.out.println("id= "+ id + ", name= " + name + ", subject= " + subject);
    }
}
