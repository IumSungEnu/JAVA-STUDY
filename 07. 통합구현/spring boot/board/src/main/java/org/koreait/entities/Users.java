package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;
import org.koreait.constants.UserType;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
@Table(indexes = { //회원명과 등록일자로 데이터 확인
        @Index(name="idx_userNm", columnList = "userNm"),
        @Index(name="idx_refDt_desc", columnList = "regDt DESC")
}) //2개 이상일 경우{}를 사용
public class Users extends BaseEntity{
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userNo;    //회원번호

    @Column(length = 40, unique = true, nullable = false)
    private String userId;  //아이디

    @Column(length = 65, nullable = false)
    private String userPw;  //비밀번호

    @Column(length = 45, nullable = false)
    private String userNm;  //회원명

    @Column(length = 100)
    private String email;   //이메일

    @Column(length = 11)
    private String mobile;  //휴대전화번호

    @Enumerated(EnumType.STRING) //순서가 바뀌면 문제가 된다.
    @Column(length = 20, nullable = false)
    private UserType type = UserType.USER;  //기본적으로 USER값이 들어간다.
}
