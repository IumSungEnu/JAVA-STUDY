package org.koreait.commons;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException{ //모든 예외들을 정리
    private HttpStatus status;//할당하여 사용한다.

    public CommonException(String message){ //매개변수가 1개일때
        this(message, HttpStatus.INTERNAL_SERVER_ERROR); //상태 코드가 없으면 500
    }
    
    public CommonException(String message, HttpStatus status){
        super(message);
        this.status = status; //상태소스
    }

    public HttpStatus getStatus(){ //응답
        return status;
    }
}
