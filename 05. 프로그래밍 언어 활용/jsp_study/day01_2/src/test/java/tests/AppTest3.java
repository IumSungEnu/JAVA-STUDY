package tests;

import commons.Validator;
import members.Member;

import members.MemberValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppTest3 {

    @Mock
    private Member member;

    @Test
    @DisplayName("모의객체 테스트1")
    public void test1(){
        //앞에 mock()을 입력하면 모의객체 생성
        Validator<Member> validator = mock(Validator.class);
        //현재 MemberValidationException 에러가 발생했을데 check(null) 예외를 발생시키겠다
        //반환값이 없는 경우 willThrow
        willThrow(MemberValidationException.class)
                .given(validator)
                .check(null);

        assertThrows(MemberValidationException.class, () -> {
            validator.check(null);
        });
    }

    @Test
    @DisplayName("모의객체 테스트2")
    public void test2(){
        //Member member = mock(Member.class); -> 상단에 @Mock를 정의하였기 때문에 쓸 필요가 x
        //반환값이 있을 경우 given
        given(member.getUserId())
                .willReturn("user02");

        assertEquals("user02", member.getUserId());
    }

    @Test
    @DisplayName("모의객체 테스트3")
    public void test3(){
        //Member member = mock(Member.class); -> 상단에 @Mock를 정의하였기 때문에 쓸 필요가 x
        given(member.getUserPw())
                .willThrow(MemberValidationException.class);
        assertThrows(MemberValidationException.class, () -> {
            member.getUserPw();
        });
    }
}
