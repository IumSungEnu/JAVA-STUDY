package texts;

import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;

@MockitoSettings(strictness = Strictness.WARN)
@ExtendWith(MockitoExtension.class)
public class MemberLoginTest {
    
    private Member member;
    private MemberDAO memberDAO;
    private LoginService service;
    @Mock
    private HttpServletRequest request;  //모의객체
    
    @BeforeEach
    public void init(){ //초기화
        member = new Member();
        member.setUserId("userab");
        member.setUserPw("_aA123456");
        member.setUserNm("사용자01");

        memberDAO = new MemberDAO();
        memberDAO.register(member);

        service = new ServiceManager().getLoingService();

    }

    private void createCorrectData(){
        given(request.getParameter("userId")).willReturn(member.getUserId());
        given(request.getParameter("userPw")).willReturn(member.getUserPw());
    }

    private void createParmData(String userId, String userPw){
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }
    
    @Test
    @DisplayName("로그인 성공하면 예외 없음")
    public void loginSuccess(){
        //String userId = request.getParameter("userId");
        //String userPw = request.getParameter("userPw");
        //System.out.printf("userId=%s, userPw=%s%n", userId, userPw);
        createCorrectData();
        assertDoesNotThrow(() -> {
            //매개변수 필요(요청 데이터), 세션필요
            service.login(request);
        });
    }

    @Test
    @DisplayName("필수 항목 체크 userId, userPw - BadRequestException")
    public void dataValidation1(){
        // userId 필수 항목 체크
        assertThrows(BadRequestException.class, () -> {
            createParmData(null, null);
            service.login(request);
        });

        // userPw 필수 항목 체크
        assertThrows(BadRequestException.class, () -> {
            createParmData(member.getUserId(), null);
            service.login(request);
        });
    }
    
    @Test
    @DisplayName("아이디가 등록되지 않은 회원이면 MemberNotFoundException 발생 검증")
    public void dataValidation2(){
        assertThrows(MemberNotFoundException.class, () -> {
            createParmData("wrongid", member.getUserPw());
            service.login(request);
        });
    }

    @Test
    @DisplayName("비밀번호가 일치하지 않는 경우 검증 - BadRequestException")
    public void dataValidation3(){
        assertThrows(BadRequestException.class, () -> {
            createParmData(member.getUserId(), "123456");
            service.login(request);
        });
    }

}
