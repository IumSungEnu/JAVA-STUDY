package controllers.members;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Login {
    @NotBlank  //필수항목
    private String userId;
    @NotBlank  //필수항목
    private String userPw;

    private boolean saveId;
}
