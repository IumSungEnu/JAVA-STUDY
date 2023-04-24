package org.koreait.controllers.users;

import lombok.RequiredArgsConstructor;
import org.koreait.commons.validatiors.MobileValidator;
import org.koreait.repositories.UsersRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component  //관리객체
@RequiredArgsConstructor  //자동 주입
public class JoinValidator implements Validator, MobileValidator { //회원가입에 필요한 추가 부분
    private final UsersRepository repository;

    @Override
    public boolean supports(Class<?> clazz) {
        return JoinForm.class.isAssignableFrom(clazz);//커맨드폼을 조인객체로 담겠다
    }

    @Override
    public void validate(Object target, Errors errors) {  //실제 검증(Object에 개인 폼이 들어간다)

        if(errors.hasErrors()){  //Bean validation 검증 실패가 있는 경우

        }

        JoinForm joinForm = (JoinForm) target;

        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPwRe();
        String mobile = joinForm.getMobile();

        //1. 아이디 중복 여부
        if(repository.userExists(userId)){
            errors.rejectValue("userId", "Validation.duplicate.userId");
        }

        //2. 비밀번호 일치 여부
        if(!userPw.equals(userPwRe)){ //비밀번호가 일치하지 않은때
            errors.rejectValue("userPwRe","Validation.incorrect.userPw");
        }

        //3. 전화번호(선택)가 있으면 형식 체크
        //나중에 쓰일수 있다. - 주소라든디...공통으로 추가하자.
        //validate 옆에 MobileValidator 추가
        if(mobile != null && !mobile.isBlank()){
            if(!mobileCheck(mobile)){ //휴대전화번호 형식이 아닌 경우
                errors.rejectValue("mobile", "Validation.mobile");
            }
            
            mobile = mobile.replaceAll("\\D", "");
            joinForm.setMobile(mobile);  //자리수가 넘어가면 오류발생(숫자가 아닌 것 제거 '//' - 객체가 아닌 참조변수이기 때문에)
        }
    }
}
