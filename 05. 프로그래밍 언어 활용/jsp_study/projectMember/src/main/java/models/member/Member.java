package models.member;

import lombok.Data;

@Data //@Getter, @Setter @EqualsAndHashCode, @RequiredArgsConstructor, @ToString
public class Member {
    private String userId;
    private String userPw;
    private String userPwRe;
    private String userNm;

    private boolean agree;
}
