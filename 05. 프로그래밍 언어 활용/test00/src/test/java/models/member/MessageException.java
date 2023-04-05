package models.member;

public class MessageException extends RuntimeException{
    public MessageException(String message){  //메세지 전달
        super(message);
    }
}
