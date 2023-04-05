package models.member;

import data.WithData;

public class MemberJoinData implements WithData {

    @Override
    public void dataCheck(Member member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String userPwRe = member.getUserPwRe();
        String userNm = member.getUserNm();

        /* 필수 항목 */
        dataCheck(userId, new MessageException("아이디를 입력해주세요."));
        dataCheck(userPw, new MessageException("비밀번호를 입력해주세요."));
        dataCheck(userPwRe, new MessageException("비밀번호를 재입력해주세요."));
        dataCheck(userNm, new MessageException("이름을 입력해주세요."));

        /* 아이디 6자리 이상 8 */

    }
}
