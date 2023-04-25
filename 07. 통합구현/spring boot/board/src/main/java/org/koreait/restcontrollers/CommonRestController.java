package org.koreait.restcontrollers;

import org.koreait.commons.rest.JSONResult;
import org.koreait.commons.rest.RestCommonException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("org.koreait.restcontrollers")  //범위를 지정해줘야 한다.
public class CommonRestController {
    @ExceptionHandler(Exception.class) //@ExceptionHandler -> 꼭 기억해두자.
    public ResponseEntity<JSONResult<Object>> errorHandle(Exception e){
        JSONResult<Object> jsonResult = new JSONResult<>();
        jsonResult.setSuccess(false);
        jsonResult.setErrorMessage(e.getMessage());

        //상태값을 기본값으로 넣어주고 ..
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;  //기본값은 500
        if(e instanceof RestCommonException){  //RestCommonException인 경우는 상태 코드 조회
            RestCommonException restE = (RestCommonException) e;
            status = restE.getStatus();
        }

        //선택코드와 응답
        return ResponseEntity.status(status).body(jsonResult);
    }
}
