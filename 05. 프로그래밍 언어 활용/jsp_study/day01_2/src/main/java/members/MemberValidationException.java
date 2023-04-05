package members;

public class MemberValidationException extends RuntimeException{ //예외
    
    //생성자 추가
    //메세지를 담을 생성자 멤버 추가
    public MemberValidationException(String message){
        super(message);
    }
}
