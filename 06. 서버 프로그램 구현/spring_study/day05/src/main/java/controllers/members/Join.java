package controllers.members;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd")  //형식을 명시해야 한다.
    private LocalDate birthDt;
    
    @AssertTrue
    private boolean agree;  //회원가입 약관

}

//@NotBlank : null이 아니고 최소한 한 개 이상의 공백아닌 문자를 포함하는지 검사한다. - 하나하나 지정해줘야 한다.
//@AssertTrue : 값이 true인지 또는 false인지 검사한다. null은 유효하다고 판단한다.