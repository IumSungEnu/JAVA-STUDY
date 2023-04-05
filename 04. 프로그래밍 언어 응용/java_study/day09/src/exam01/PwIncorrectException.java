package exam01;

public class PwIncorrectException extends Exception{  //생성자만 정의
    public PwIncorrectException(String message){
        super(message);  //생성자 메서드 호출
    }
}
