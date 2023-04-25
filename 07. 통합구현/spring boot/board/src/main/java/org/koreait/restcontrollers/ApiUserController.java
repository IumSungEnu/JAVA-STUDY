package org.koreait.restcontrollers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.commons.rest.JSONResult;
import org.koreait.commons.rest.RestCommonException;
import org.koreait.controllers.users.JoinForm;
import org.koreait.controllers.users.JoinValidator;
import org.koreait.entities.Users;
import org.koreait.models.user.UserSaveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

@Log
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class ApiUserController {

    private final UserSaveService service;
    private final JoinValidator validator;

    //응답에 대한 코드
    @PostMapping("/account")
    public ResponseEntity<Object> account(@RequestBody  @Valid JoinForm joinForm, Errors errors){

        validator.validate(joinForm, errors);

        //조회
        ResourceBundle bundle = ResourceBundle.getBundle("messages.validations");

        //검증(에러 부분)  -> 시험때 이것도 있으면 좋을것..
        if(errors.hasErrors()){
            List<String> errMessages = errors.getAllErrors().stream().map(e -> {
                List<String> messages = new ArrayList<>();
                String[] codes =  e.getCodes();  //특정 필드의 코드를 가지고 온다.
                for(String code : codes){
                    String msg = null;
                    try{
                        msg = bundle.getString(code);   //있을때
                    }catch (Exception e2){
                        //messages.add(code);
                        msg = e.getDefaultMessage();   //없ㅇ츨때
                    }
                    if(msg != null && !msg.isBlank()){
                        messages.add(msg);
                    }
                }
                return messages.stream().collect(Collectors.joining(","));
            }).toList();

            //넘긴다.
            String errMessage = errMessages.stream().collect(Collectors.joining(","));
            throw new RestCommonException(errMessage, HttpStatus.BAD_REQUEST);
        }

        service.save(joinForm);

        //log.info(joinForm.toString());
        //이때 필요한게 ARC이다. -> 서버가 켜져있어야 응답이 가능하다.

        return ResponseEntity.ok().build();  //성공시는 응답 코드 200, body 데이터 x
    }


}
