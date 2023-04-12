package controllers.members;

import models.member.Member;
import models.member.MemberDAO;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoginValidater implements Validator {
    
    @Autowired
    private MemberDAO memberDAO;
    
    @Override
    public boolean supports(Class<?> clazz) { //로그인 커맨드 객체 생성
        
        return Login.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Login login = (Login) target;

        String userId = login.getUserId();
        String userPw = login.getUserPw();
        
        //1. 아이디로 회원이 조회되는지
        Member member = null;
        if(userId != null && !userId.isBlank()){
            member = memberDAO.get(userId);
            if(member == null){
                errors.rejectValue("userId", "MemberNotExists", "가입되어있지 않은 회원입니다.");
            }
        }
        
        //2. 회원이 있다면 -> 비밀번호 검증
        if(member != null && userPw != null && !userPw.isBlank()){
            String hash = member.getUserPw();
            boolean isMatched = BCrypt.checkpw(userPw, hash);
            if(!isMatched){
                errors.rejectValue("userPw", "IncorrectPw", "비밀번호가 일치하지 않습니다.");
            }
        }

    }
}
