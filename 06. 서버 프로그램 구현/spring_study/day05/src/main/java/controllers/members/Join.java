package controllers.members;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Join {

    @NotBlank
    @Size(min=6, max=16)
    private String userId;
    
    @NotBlank
    @Size(min=8)
    private String userPw;
    
    @NotBlank
    private String userPwRe;
    
    @NotBlank
    private String userNm;
    
    @Email
    private String email;
    
    @AssertTrue
    private boolean agree;  //회원가입 약관

}

//@NotBlank : null이 아니고 최소한 한 개 이상의 공백아닌 문자를 포함하는지 검사한다. - 하나하나 지정해줘야 한다.
//@AssertTrue : 값이 true인지 또는 false인지 검사한다. null은 유효하다고 판단한다.