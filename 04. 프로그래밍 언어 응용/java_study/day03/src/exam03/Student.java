package exam03;

public class Student {
    //변수가 존재하기 위해서는 값이 필요한데 그 값을 담을 메모리가 필요하다.
    //설계도, 변수가 아니라 변수 정의만 해놓은 상태

    int id;  //학번
    String name;  //이름
    String subject;  //전공과목
    
    void study(){  //클래스 안에 함수 정의(멤버 함수/메서드)
        System.out.println("학번이 " + id + "인 " + name + "이 " + subject + "를(을) 공부한다");
    }
}
