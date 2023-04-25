package org.koreait.models.user;

public class LoginValidationException extends RuntimeException{
    //어던 항목이 들어갈 것인지 필드가 필요하고 메시지가 들어간다.

    private String field;
    public LoginValidationException(String message, String field){
        super(message);
        this.field = field;
    }

    public String getField(){
        return field;
    }
}
