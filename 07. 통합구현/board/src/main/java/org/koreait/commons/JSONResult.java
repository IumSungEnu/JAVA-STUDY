package org.koreait.commons;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONResult<T> {
    
    private boolean success;
    private HttpStatus status = HttpStatus.OK;
    private String messages; //실패시 에러
    private T data; //성공시
}
