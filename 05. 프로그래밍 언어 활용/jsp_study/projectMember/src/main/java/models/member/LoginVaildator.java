package models.member;

import validators.Validator;

import javax.servlet.http.HttpServletRequest;

public class LoginVaildator implements Validator<HttpServletRequest> {

    private MemberDAO memberDAO; //회원조회

    @Override
    public void check(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        /* 필수 데이터 검증 - userId, userPw */
        requeiredCheck(userId, new BadRequestException("아이디를 입력하세요."));
        requeiredCheck(userPw, new BadRequestException("비밀번호를 입력하세요."));

        /* 등록된 아이디인지 체크 - memberDAO*/
        Member member = memberDAO.get(userId);
        if(member == null){ //등록된 회원이 아니라면...
            throw new MemberNotFoundException();
        }
        
        /* 비밀번호 일치 여부 체크 */
        if(!member.getUserPw().equals(userPw)){ //비밀번호가 일치하지 않을 경우
            throw new BadRequestException("비밀번호가 일치하지 않습니다.");
        }
    }

    public void setMemberDAO(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }
}
