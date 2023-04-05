package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Member {
    private String userId;
    private String userPw;
    private String userPwRe;
    private String userNm;
}
