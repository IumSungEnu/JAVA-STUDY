package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

@Data
@Entity
public class BoardData { //엔티티로 분류한다. - 기본키 반드시 필요

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100, nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    //회원쪽과 매핑(한명의 회원이 여러개 게시글을 작성)
    @ManyToOne  //다대일
    @JoinColumn(name="userNo")
    @ToString.Exclude
    public Member member;

    /*
    @ManyToOne
    @JoinColumn(name = "adminNo")
    private Member admin;  //관리자
    */
}
