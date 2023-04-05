package tests;

import members.Member;
import members.MemberJoinService;
import members.MemberValidationException;
import members.MemberValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberJoinTest {//회원가입이 잘 되었는지 안됬는지 확인(가장 쉬운 단계부터)

    private Member getMember(){
        //멤버 데이터
        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserNm("사용자01");

        return  member;
    }

    @Test
    @DisplayName("회원가입 성공하면 예외가 발생 없음")
    public void joinSuccessTest(){
        MemberJoinService service = new MemberJoinService();
        service.setValidator(new MemberValidator());
        Member member = getMember();

        assertDoesNotThrow(() -> {
            //수행 코드
            service.join(member);
        });
    }
    
    @Test
    @DisplayName("Member 객체가 null값일때 MemberValidationException 발생여부 체크")
    public void joinMemberNullTest(){

        MemberJoinService service = new MemberJoinService();
        //MemberValidationException thrown -> 예외 반환값 assertThrows
        service.setValidator(new MemberValidator());

        MemberValidationException thrown = assertThrows(MemberValidationException.class, () -> {
            service.join(null);
        });

        String message = thrown.getMessage();
        assertEquals(true, message.contains("잘못된 접근"));
    }

    @Test
    @DisplayName("회원가입 데이터 중 userID 검증 - 필수항목, 자리수가 6자리 이상, 실패시 - MemberValidationException 발생")
    public void joinUserIdValidationTest(){
        MemberJoinService service = new MemberJoinService();
        service.setValidator(new MemberValidator());
        Member member = getMember();
        assertThrows(MemberValidationException.class, () -> {
            /* 값이 없을때 */
            member.setUserId(null);
            service.join(member);

            member.setUserId("");
            service.join(member);

            member.setUserId("user"); //자리수 체크
            service.join(member);
        });
    }

    @Test
    @DisplayName("회원가입 비밀번호가 없거나 자리수 8~16자리 이하로 입력되지 않은 경우 예외발생 체크 - MemberValidatrionException")
    public void joinUserPwValidationTest(){
        MemberJoinService service = new MemberJoinService();
        service.setValidator(new MemberValidator());

        Member member = getMember();
        assertThrows(MemberValidationException.class, () -> {
            //필수 항목 체크 - null, ""
            member.setUserPw(null);
            service.join(member);

            member.setUserPw(" ");
            service.join(member);

            member.setUserPw("abcd");
            service.join(member);

            member.setUserPw("abcd111111111111111111111");
            service.join(member);
        });
    }
}

//테스트를 하고 기능을 확인하고 옮긴다.
//test를 진행하여 모두 성공적으로 작동이 되면 폴더들을 main에 있는 java파일로 통채로 옮긴다.
//여기서는 commons와 members 파일을 옮겼다.
