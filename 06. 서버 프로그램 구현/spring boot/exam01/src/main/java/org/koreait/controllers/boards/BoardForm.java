package org.koreait.controllers.boards;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BoardForm { //커맨드 객체로 쓴다.
    @NotBlank  //필수항목 -jakarta
    private String subject;
    @NotBlank
    private String content;
}
