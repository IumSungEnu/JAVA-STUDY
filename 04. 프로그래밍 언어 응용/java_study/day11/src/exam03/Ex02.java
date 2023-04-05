package exam03;

public class Ex02 { //class 클래스
    public static void main(String[] args){
        try {
            Class cls = Class.forName("exam03.Person");  //반환값 : Class cls
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
