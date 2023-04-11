package models.member;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private String userId;
    private String userNm;
    private String mobile;
    private String intro; //자기소개 추가
    private LocalDateTime regDt;
}
