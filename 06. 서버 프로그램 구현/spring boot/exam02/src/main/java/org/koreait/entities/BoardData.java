package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.repositories.MemberRepository;

import java.time.LocalDateTime;

@Data
@Entity
public class BoardData {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    private Long Id;  //게시글 번호

    @Column(length = 150, nullable = false) //nullable = false -> notnull (필수조건)
    private String subject; //제목

    @Lob
    @Column(nullable = false)
    private String content; //내용

    @Temporal(TemporalType.TIMESTAMP) //TIMESTAMP -> 날짜 + 시간
    @CreationTimestamp
    private LocalDateTime regDt;  //게시글 작성날짜

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private LocalDateTime modDt;  //게시글 수정날짜

    @ManyToOne
    @JoinColumn(name = "userNo")
    private Member member;
}
