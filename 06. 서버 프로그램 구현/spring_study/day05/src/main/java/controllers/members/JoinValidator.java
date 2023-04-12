package controllers.members;

import lombok.RequiredArgsConstructor;
import models.member.MemberDAO;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component  //자동주입
@RequiredArgsConstructor
public class JoinValidator implements Validator {

    private final MemberDAO memberDAO;

    @Override
    public boolean supports(Class<?> clazz) {
        //Join 커멘드 객체로 검증을 한정(대부분 똑같은 양식 - 정형화된 양식)
        return Join.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //커맨드 객체 Object target
        //정형화된 에러처리 방식
        Join join = (Join) target;
        
        /*
        1. 필수항목 체크 - userId, userPw, userPwRe, userNm
        2. userId 중복 여부 - 이미 가입된 경우는 가입불가
        3. userPw, userPwRe의 일치 여부
        4. 약관 동의 여부
        */

        String userId = join.getUserId();
        String userPw = join.getUserPw();
        String userPwRe = join.getUserPwRe();
        //String userNm = join.getUserNm();
        //boolean agree= join.isAgree();

        //1. 필수항목 체크
        /* ①번째 방법
        if(userId == null || userId.isBlank()){ //아이디
            errors.rejectValue("userId", "Required2", "아이디 입력(기본)");
        }
        if(userPw == null || userPw.isBlank()){ //비밀번호
            errors.rejectValue("userPw", "Required");
        }
        if(userPwRe == null || userPwRe.isBlank()){ //비밀번호 확인
            errors.rejectValue("userPwRe", "Required");
        }
        if(userNm == null || userNm.isBlank()){ //회원명
            errors.rejectValue("userNm", "Required");
        }
        */


        /*
        //②번째 방법
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPwRe", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userNm", "Required");
        */


        //2. userId 중복 여부 - 이미 가입된 경우는 가입불가
        if(userId != null && !userId.isBlank() && memberDAO.isExists(userId)){
            errors.rejectValue("userId", "Duplicated");
        }

        //3. userPw, userPwRe의 일치 여부
        if(userPw != null && !userPw.isBlank()
                && userPwRe != null && !userPwRe.isBlank()
                && !userPw.equals(userPwRe)){

            errors.rejectValue("userPwRe", "Incorrect");
        }

        // 공통 에러 테스트 - 임시(특정사항일 경우에만 쓰인다 - 잘 쓰이지 않는다)
        //errors.reject("common", "공통 에러 테스트");
    }
}
