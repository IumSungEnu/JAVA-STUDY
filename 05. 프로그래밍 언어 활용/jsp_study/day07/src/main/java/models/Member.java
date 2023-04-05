package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @Getter @Setter @AllArgsConstructor
public class Member {
    private String userId;
    private String userPw;
    private String userNm;
    
    //@AllArgsConstructor - 생성자 추가
}
