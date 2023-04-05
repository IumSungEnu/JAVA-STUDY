package models.member;


public class BadRequestException extends RuntimeException{ //예외발생 메세지
    public  BadRequestException(String message){
        super(message);
    }
}
