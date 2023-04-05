package texts;

import models.member.ServiceManager;
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
    private JoinService service;

    @BeforeEach //테스트하기전에 미리..
    public void init(){  //초기화
        //service = new JoinService();               //관리할수 있는 객체를 만드는게 유효하다.
        //service.setValidator(new JoinValidator()); //관리할수 있는 객체를 만드는게 유효하다.
        //                   ↓ (ServiceManager) - 대체 가능
        ServiceManager manager = new ServiceManager();
        service = manager.getJoinService();

        member = new Member();
        member.setUserId("userfirst");
        member.setUserPw("_aA123456");
        member.setUserPwRe("_aA123456");
        member.setUserNm("사용자01");
        member.setAgree(true);
    }

    //통과시키기
    @Test
    @DisplayName("회원가입에 성공하면 예외가 발생하지 않음")
    public void joinSuccess(){
        //JoinService service = new JoinService();
        //Member member = new Member();  -> init()에 선언했기 때문에 필요x
        assertDoesNotThrow(() -> {
            service.join(member);
        });
    }
    
    @Test
    @DisplayName("Join 메서드에 null값이 들어가면 BadRequestException 발생")
    public void dataValuidation1(){ //예외 추가
        assertThrows(BadRequestException.class, () -> { 
            service.join(null); //예외 발생을 위해 joinService에 null값일 경우 작성
        });
    }
    
    @Test
    @DisplayName("필수 항목 체크 - userId, userPw, userPwRe, uesrNm, 실패시 BadRequestException 발생")
    public void dataValuidation2(){
        assertThrows(BadRequestException.class, () -> {
            //Member member = new Member();

            //userNm이 없는 경우
            member.setUserNm(null);
            service.join(member);
        });

        assertThrows(BadRequestException.class, () -> {
            //userPw이 없는 경우
            member.setUserPw(null);
            service.join(member);
        });

        assertThrows(BadRequestException.class, () -> {
            //userPwRe이 없는 경우
            member.setUserPwRe(null);
            service.join(member);
        });

        assertThrows(BadRequestException.class, () -> {
            //userId이 없는 경우
            member.setUserId(null);
            service.join(member);
        });
        //순서를 거꾸로 진행하여 하나씩 오류를 제거.
    }
    
    @Test
    @DisplayName("userId가 6자리 이상, 영문만 입력 가능 - BadRequestException")
    public void dataValidation3(){
        //6자리 미만 아이디 예외 검증
        assertThrows(BadRequestException.class, () ->{
            member.setUserId("abcd");
            service.join(member);
        });
        
        //영문이 아닌 문자가 들어갔을때 예외 검증
        assertThrows(BadRequestException.class, () -> {
            member.setUserId("한글입력");
            service.join(member);
        });
    }

    @Test
    @DisplayName("userPw 자리수는 8자리 이상 입력 검증 - BadRequestException")
    public void dataValidation4(){
        assertThrows(BadRequestException.class, () -> {
            member.setUserPw("1234");
            service.join(member);
        });
    }

    @Test
    @DisplayName("userPw는 알파벳, 숫자, 특수문자가 각각 1개 이상 입력 검증 - BadRequestException")
    public void dataValidation5(){
        assertThrows(BadRequestException.class, () -> {
            member.setUserPw("123456789");
            service.join(member);
        });
    }

    @Test
    @DisplayName("userPw와 userPwRe가 일치 검증 - BadRequestException")
    public void dataValidation6(){
        assertThrows(BadRequestException.class, () -> {
           member.setUserPw("1234");
           service.join(member);
        });
    }
}
