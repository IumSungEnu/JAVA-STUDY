package org.koreait.controllers.users;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.koreait.entities.Users;
import org.modelmapper.ModelMapper;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class JoinForm {
    @NotBlank
    @Size(min=6)  //최소 6자리 이상
    private String userId;

    @NotBlank
    @Size(min=8, max=16)
    private String userPw;

    @NotBlank
    private String userPwRe;

    @NotBlank
    private String userNm;

    @Email
    private String email;

    private String mobile;

    @AssertTrue  //참으로 추가한다.
    private boolean agree;  //반드시 참이어야 한다.
    
    public static Users of(JoinForm joinForm){
        //변환 매서드 추가
        //ModelMapper mapper = new ModelMapper();
        //Users user = mapper.map(joinForm, Users.class);  //변환
        //return user;
        //    ↓ 짧게 작성하고 싶으면
        return new ModelMapper().map(joinForm, Users.class);
    }
}
