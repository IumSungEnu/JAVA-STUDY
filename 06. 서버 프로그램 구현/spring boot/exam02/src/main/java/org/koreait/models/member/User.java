package org.koreait.models.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class User {
    private Long userNo;
    private String userId;
    //@JsonIgnore //민감한 내용을 보이지 않게 해준다.
    private String userPw;
    private String userNm;

    /*
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime regDt; //가입날짜
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime modDt; //수정날짜
    */
}
