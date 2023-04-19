package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Target;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.contants.MemberType;

import java.time.LocalDate;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

@Data
@Entity
@Table(name="users", indexes = {
        @Index(name="idx_userNm", columnList = "userNm"),
        @Index(name="idx_rdgDt_desc", columnList = "regDt DESC")})
public class Member {
    @Id  //기본키
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long userNo;

    @Column(length = 45, unique = true, nullable = false) //nullable = false -> not null
    private String userId;

    @Column(length = 65, nullable = false)
    private String userPw;

    @Column(length = 40, nullable = false)
    //name="memberNm"을 입력할 경우 db에서 이름이 수정된다.
    private String userNm;  //회원명을 가지고 조회를 안다고 할때 index를 사용한다.
                            //위에 table에 설정해준다.
    //@Transient  //제외
    @Column(name = "tell", length = 11)
    private String mobile;

    @Enumerated(EnumType.STRING)
    @Column(length = 40)
    private MemberType type;

    @Temporal(TemporalType.DATE)  //.DATE : db에 들어갈때 날짜만 들어간다(시간x)
    @CreationTimestamp  //날짜가 자동으로 주입
    private LocalDate regDt;

    @Temporal(TemporalType.DATE)
    @UpdateTimestamp    //수정할때마다 자동 주입
    private LocalDate modDt;
}
