package members;

import commons.Validator;

public class MemberValidator implements Validator<Member> {
    //외부 클래스 MemberValidationException에서 가져오기

    @Override
    public void check(Member o) {

        /* null 값 체크 */
        if(o == null){
            throw new MemberValidationException("잘못된 접근입니다.");
        }

        /* 아이디 검증 -필수 항목, 자리수가 6자리 */
        requiredCheck(o.getUserId(), new MemberValidationException("아이디를 입력하세요."));
        lengthCheck(o.getUserId(), 6, new MemberValidationException("아이디는 6자리 이상으로 입력하세요."));

        /* 비밀번호 검증 - 필수 항목, 자리수가 8~16 이하*/
        requiredCheck(o.getUserPw(), new MemberValidationException("비밀번호를 입력하세요."));
        lengthCheck(o.getUserPw(), 8, 16, new MemberValidationException("비밀번호는 /8자리 이상 16 이하로 입력하세요."));
    }

    @Override
    public void setException(RuntimeException e) {

    }
}
