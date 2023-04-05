package tests;

import data.WithData;
import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MemberJoinTest {
    private Member member;
    private MemberJoinService service;

    @BeforeEach
    public void init(){ //멤버 임시정보, 초기화
        member = new Member();
        member.setUserId("user01");
        member.setUserPw("_aA123456");
        member.setUserPwRe("_aA123456");
        member.setUserNm("홍길동");

        //매니저
        ServiceManager manager = new ServiceManager();
        service = manager.getMemberJoinService();

    }

    @Test
    @DisplayName("회원가입에 성공하면 오류가 발생하지 않는다.")
    public void JoinSe(){
        assertDoesNotThrow(() -> {
        service.JoinSv(member);
        });
    }

    @Test
    @DisplayName("null값일 경우 오류발생")
    public void jointest0(){
        assertThrows(MessageException.class, () -> {
           service.JoinSv(member);
        });
    }

    @Test
    @DisplayName("필수항목 체크 - 아이디,비밀번호,이름이 틀릴 시 오류발생")
    public void jointest1(){ //순서를 거루로 하기

        //이름
        assertThrows(MessageException.class, () -> {
            member.setUserNm(null);
            service.JoinSv(member);
        });
        //비밀번호 재확인
        assertThrows(MessageException.class, () -> {
            member.setUserPwRe(null);
            service.JoinSv(member);
        });
        //비밀번호
        assertThrows(MessageException.class, () -> {
            member.setUserPw(null);
            service.JoinSv(member);
        });
        //아이디
        assertThrows(MessageException.class, () -> {
            member.setUserId(null);
            service.JoinSv(member);
        });
    }

    @Test
    @DisplayName("아이디가 6자리 이상이 아닐시 오류발생")
    public void jointest2(){
        assertThrows(MessageException.class, () -> {
            member.setUserId("aaaa");
            service.JoinSv(member);
        });
    }
}
